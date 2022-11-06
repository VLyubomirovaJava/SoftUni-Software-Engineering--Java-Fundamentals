package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int commandsCount =Integer.parseInt(scanner.nextLine());
        List<String> partyGoers =new ArrayList<>();
        for (int i = 0; i < commandsCount; i++) {
            String message = scanner.nextLine();
            String []command =message.split(" ");
            boolean isInTheList=false;
            boolean isNotOnTheList=false;
            if (!"not".equalsIgnoreCase(command[2])){
                for (String name:partyGoers) {
                    if (name.equals(command[0])){
                        isInTheList=true;
                        break;
                    }
                }
                if (isInTheList){
                    System.out.printf("%s is already in the list!%n",command[0]);
                }
                else {
                  partyGoers.add(command[0]);
                }
            } else {
                if (!partyGoers.contains(command[0])){
                    System.out.printf("%s is not in the list!%n",command[0]);
                }else {
                    partyGoers.remove(command[0]);
                }
            }
        }
        for (String name:partyGoers) {
            System.out.println(name);
        }

    }
}




