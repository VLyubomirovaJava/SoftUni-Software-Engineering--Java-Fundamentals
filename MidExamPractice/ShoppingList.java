package MidExamPractice;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> groceriesList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String lineInput = scanner.nextLine();
        while (!lineInput.contains("Go Shopping")) {
            String[] commandData = lineInput.split("\\s+");
            String command = commandData[0];

            switch (command) {
                case "Urgent":
                    String urgentItem = (commandData[1]);
                    if (!groceriesList.contains(urgentItem)) {
                        groceriesList.add(0, urgentItem);
                    }
                    break;
                case "Unnecessary":
                    String unnecessaryItem = (commandData[1]);
                    if (groceriesList.contains(unnecessaryItem)) {
                        groceriesList.remove(unnecessaryItem);
                    }
                    break;
                case "Correct":
                    String oldItem = (commandData[1]);
                    String newItem = (commandData[2]);
                    if (groceriesList.contains(oldItem)) {
                        groceriesList.set( groceriesList.indexOf(oldItem) , newItem);
                    }
                    break;
                case "Rearrange":
                    String rearrangeItem = (commandData[1]);
                    if (groceriesList.contains(rearrangeItem)) {
                        groceriesList.remove(rearrangeItem);
                        groceriesList.add(rearrangeItem);
                    }
                    break;
            }
            lineInput = scanner.nextLine();
        }
            System.out.println(String.join(", ",groceriesList));        }
    }





