package MidExamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(",+"))
                .collect(Collectors.toList());
        IntStream.range(0, items.size()).forEach(i -> items.set(i, items.get(i).trim()));

        String lineInput = scanner.nextLine();
        while (!lineInput.contains("Craft!")) {
            String[] commandData = lineInput.split(" - ");
            String command = commandData[0];
            switch (commandData[0]) {
                //Collect - {item}" if not already on the list, add the item
                case "Collect":
                    String item = commandData[1];
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    String toDrop = commandData[1];
                        items.remove(toDrop);

                    break;
                 //•	"Combine Items - {old_item}:{new_item}" - you should check if the old item exists.
                // If so, add the new item after the old one. Otherwise, ignore the command.
                case "Combine Items":
                    String[] oldNewItem = commandData[1].split(":");
if (items.contains(oldNewItem[0])){
    items.add(((items.indexOf(oldNewItem[0]))+1),oldNewItem[1]);
}
break;
//•	"Renew – {item}" –
// if the given item exists, you should change its position and put it last in your inventory
                case"Renew":
                    if (items.contains(commandData[1])){
                        items.add(items.get(items.indexOf(commandData[1])));
                        items.remove(commandData[1]);
                    }
                    break;
            }
            lineInput=scanner.nextLine();
        }
        System.out.println(String.join(", ",items));        }


}




