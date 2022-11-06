package Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String bomb =scanner.nextLine();
        int length = numbersList.size()-1;
        int sum=0;
        String[] bombInfo = bomb.split(" ");
int bombNumber =Integer.parseInt(bombInfo[0]);
int bombPower =Integer.parseInt(bombInfo[1]);
while (numbersList.contains(bombNumber)){
int indexBomb=numbersList.indexOf(bombNumber);
int left =Math.max(0,indexBomb-bombPower);
int right =Math.min(numbersList.size()-1,indexBomb+bombPower);
    for (int i = right; i >= left; i--) {
        numbersList.remove(i);
    }
}
        for (int i = 0; i <numbersList.size() ; i++) {
            sum+=numbersList.get(i);
        }
        System.out.println(sum);
    }
}




