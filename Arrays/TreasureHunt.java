package Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] chests =scanner.nextLine().split("\\|");

            //masiv samo za komandata
 String command =scanner.nextLine();
while (!command.equals("Yohoho!")) {
    String[] commandParts = command.split(" ");

    switch (commandParts[0]) {
        case "Loot":
            for (int i = 1; i < commandParts.length; i++) {
                boolean alreadyCounted = false;
                for (int j = 0; j < chests.length; j++) {
                    if (commandParts[i].equals(chests[j])) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    String newChest = commandParts[i] + " " + String.join(" ", chests);
                    chests = newChest.split(" ");
                }
            }
            break;
        case "Drop":
            int position = Integer.parseInt(commandParts[1]);
            if (position <= chests.length - 1 && position >= 0) {
                String dropItem = chests[position];
                for (int i = position; i < chests.length - 1; i++) {
                    chests[i] = chests[i + 1];
                }
                chests[chests.length - 1] = dropItem;
            } else {
                break;
            }
            break;
        case "Steal":
            int numberOfStolenGoods = Integer.parseInt(commandParts[1]);
            if (numberOfStolenGoods >= 0 && numberOfStolenGoods < chests.length) {
                for (int i = 0; i < numberOfStolenGoods; i++) {
                    System.out.print(chests[chests.length - numberOfStolenGoods + i]);
                    if ((i != numberOfStolenGoods - 1)) {
                        System.out.print(", ");
                    }
                }
                String[] tempChest = new String[chests.length - numberOfStolenGoods];
                for (int i = 0; i < tempChest.length; i++) {
                    tempChest[i] = chests[i];
                }
                chests = tempChest;
            } else if (numberOfStolenGoods >= 0) {
                for (int i = 0; i < chests.length; i++) {
                    System.out.print(chests[i]);
                    if (i != chests.length - 1) {
                        System.out.print(", ");
                    }
                }
                chests = new String[0];
            }
            System.out.println();
            break;
    }
    command = scanner.nextLine();
}
String treasureCount =String.join("",chests);
int charCounter =0;
        for (int i = 0; i <treasureCount.length() ; i++) {
            charCounter++;
        }
        double averageTreasure =(1.0*charCounter)/chests.length;
        if (charCounter>0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        }else {
            System.out.println("Failed treasure hunt.");

        }
}}




