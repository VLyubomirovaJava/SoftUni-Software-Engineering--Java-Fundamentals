package MidExamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input;
        int countShot = 0;
        while (!"End".equals(input = scanner.nextLine())) {
            int shot = Integer.parseInt(input);
            if (shot>=targets.size()){

            }
if (shot< targets.size()){
    int current =targets.get(shot);
}
if (targets.get(shot)==-1){
    input=scanner.nextLine();
countShot++;

}
            }
    }
}




