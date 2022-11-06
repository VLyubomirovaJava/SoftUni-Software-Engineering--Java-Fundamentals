package Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String lineInput = scanner.nextLine();
        while (!lineInput.equals("3:1")) {
            String[] commandData = lineInput.split(" ");
            String command = commandData[0];
            switch (command) {
                case "merge":
                    int startIndex = Integer.parseInt(commandData[1]);
                    int endIndex = Integer.parseInt(commandData[2]);
                    mergeMyLine(arrays, startIndex, endIndex);
                    break;
                case "divide":
                    int divideIndex = Integer.parseInt(commandData[1]);
                    int divideTimes = Integer.parseInt(commandData[2]);
                    List<String> dividedString = new ArrayList<>();
                    // vzemame za konkreten element indexa ot koito trqbva da delim
                    String currentElement = arrays.get(divideIndex);
                    //delim na putite upomenati v komandata ot konkretniq element
                    int substring = currentElement.length() / divideTimes;
                    int count = 0;
                    String separatedElement = "";
                    int counterAdded = 0;
                    for (int i = 0; i < currentElement.length(); i++) {
                        char symbol = currentElement.charAt(i);
                        separatedElement += symbol;
                        count++;
//ako ne mojem da gi razdelim po ravno
                        if (count == substring && counterAdded + 1 < divideTimes) {
                            dividedString.add(separatedElement);
                            count = 0;
                            counterAdded++;
                            separatedElement = "";
                        }
                    }
                    dividedString.add(separatedElement);
                    arrays.remove(divideIndex);
                    for (int i = dividedString.size() - 1; i >= 0; i--) {
                        arrays.add(divideIndex, dividedString.get(i));
                    }
                    break;
            }

             lineInput = scanner.nextLine();
    }
        for (String lineOfChar:arrays) {
            System.out.print(lineOfChar+ " ");
        }
}

public static void mergeMyLine(List<String> arrays,int startIndex, int endIndex){
if (startIndex<0){
startIndex=0;
}
//if the end index is greater than the last index in the list, the end index is to become the new ending item
if (endIndex> arrays.size()-1){
    endIndex=arrays.size()-1;
}
int counter =startIndex;
    for (int i = startIndex; i <endIndex ; i++) {
        String concat =arrays.get(counter) + arrays.get(counter+1);
        arrays.set(counter,concat);
        arrays.remove(counter+1);
    }
    }
}


