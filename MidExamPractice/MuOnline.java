package MidExamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> rooms = Arrays.stream((scanner.nextLine()
                .split("\\|")))
                .collect(Collectors.toList());
int initialHealth =100;
int initialBitcoin =0;
int count =0;
while (count<= rooms.size()-1){
    //splitting the rooms as commands
    String[]command =rooms.get(count).split(" ");
    switch (command[0]) {
        case "potion":
            //we are healed with the value of the potion
            //health cannot exceed your initial health (100).
            int potion = Integer.parseInt(command[1]);
            if ((initialHealth + potion) > 100) {
                potion = 100 - initialHealth;
            }
            initialHealth += potion;
            System.out.printf("You healed for %d hp.%n", potion);
            System.out.printf("Current health: %d hp.%n", initialHealth);
            break;
        case "chest":
            int bitcoin = Integer.parseInt(command[1]);
            initialBitcoin += bitcoin;
            System.out.printf("You found %d bitcoins.%n", bitcoin);
            break;
        default:
            int monsterAttack = Integer.parseInt(command[1]);
            initialHealth -= monsterAttack;
            String monster = command[0];
            if (initialHealth > 0) {
                System.out.printf("You slayed %s.%n", monster);
            } else {
                System.out.printf("You died! Killed by %s.%n", monster);
                System.out.printf("Best room: %d%n", count + 1);
                return;
            }
            break;
    }
    //to count the rooms
    count++;
}
        System.out.printf("You've made it!%n");
        System.out.printf("Bitcoins: %d%n",initialBitcoin);
        System.out.printf("Health: %d%n",initialHealth);
    }
}




