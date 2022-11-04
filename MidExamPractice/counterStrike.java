package MidExamPractice;

import java.util.Scanner;

public class counterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //starting energy
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command ;
        int battleCount = 0;
        while (!"End of battle".equals(command = scanner.nextLine())) {
            int requiredDistance = Integer.parseInt(command);

            if (initialEnergy-requiredDistance <0 ) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battleCount, initialEnergy);
                return;
            }else {
                initialEnergy -= requiredDistance;
                battleCount++;
            }
            //Every third won battle increases your energy with the value of your current count of won battles.
            if (battleCount % 3 == 0) {
                initialEnergy += battleCount;
            }
            }
        System.out.printf("Won battles: %d. Energy left: %d", battleCount, initialEnergy);

        }
    }
