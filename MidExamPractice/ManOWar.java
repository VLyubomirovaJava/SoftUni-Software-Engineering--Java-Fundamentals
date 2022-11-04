package MidExamPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String lineInput;
        boolean isThePirateShipSunken = false;
        while (!"Retire".equals(lineInput = scanner.nextLine())) {
            String[] tokens = lineInput.split(" ");
            switch (tokens[0]) {
                //Fire {index} {damage}"
                case "Fire":
                    int index = Integer.parseInt(tokens[1]);
                    int damage = Integer.parseInt(tokens[2]);

                    if (index < warShip.size() && index >= 0) {
                        int sum = warShip.get(index) - damage;
                        if (sum<= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            isThePirateShipSunken = true;
                            break;
                        }else {
                            warShip.remove(index);
                            warShip.add(index,sum);
                        }
                    }
                    break;
                //   Defend {startIndex} {endIndex} {damage}"
                case "Defend":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int dmg = Integer.parseInt(tokens[3]);

                    if (startIndex < pirateShip.size() && startIndex >= 0) {
                        if (endIndex < pirateShip.size() && endIndex >= 0) {
                            for (int i = startIndex; i <= endIndex; i++) {
                                int sum = 0;
                                sum = pirateShip.get(i) - dmg;
                                if (sum <= 0) {
                                    System.out.println("You lost! The pirate ship has sunken.");
                                    isThePirateShipSunken = true;
                                    break;
                                }
                                pirateShip.remove(i);
                                pirateShip.add(i, sum);
                            }
                        }
                    }
                        break;
                        //Repair {index} {health}"
                        case "Repair":
                            int repairIndex = Integer.parseInt(tokens[1]);
                            int health = Integer.parseInt(tokens[2]);
                            if (repairIndex < pirateShip.size() && repairIndex >= 0) {
                                int sum = health + pirateShip.get(repairIndex);
                                if (sum <= maxHealth) {
                                    pirateShip.remove(repairIndex);
                                    pirateShip.add(repairIndex, sum);
                                } else {
                                    pirateShip.remove(repairIndex);
                                    pirateShip.add(repairIndex, maxHealth);
                                }
                            }
                            break;
                        case "Status":
                            int counter = 0;
                            for (int i = 0; i < pirateShip.size(); i++) {
                                if (pirateShip.get(i) < maxHealth * 0.2) {
                                    counter++;
                                }
                            }
                            System.out.printf("%d sections need repair.%n", counter);
                            break;
                    }
            }
            if (!isThePirateShipSunken) {
                int pirateShipSum = 0;
                int warshipSum = 0;
                for (int i = 0; i <pirateShip.size() ; i++) {
                    pirateShipSum+=pirateShip.get(i);
                }

        for (int i = 0; i <warShip.size() ; i++) {
            warshipSum+=warShip.get(i);
        }


                System.out.printf("Pirate ship status: %d%n", pirateShipSum);
                System.out.printf("Warship status: %d", warshipSum);
            }
        }
    }






