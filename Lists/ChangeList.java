package Lists;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
//Write a program that reads a list of integers from the console and receives commands which manipulate the list.
// Your program may receive the following commands:
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] commandData = lineInput.split(" ");
            String command = commandData[0];
            switch (command) {
                case "Delete":
                    int numToBeDeleted = Integer.parseInt(commandData[1]);
                            numbersList.removeAll(List.of(numToBeDeleted));
                    break;

                case "Insert":
                    int numToBeInserted = Integer.parseInt(commandData[1]);
                    int IndexToInsertAt = Integer.parseInt(commandData[2]);
                            numbersList.add(IndexToInsertAt, numToBeInserted);
                    break;
            }
            lineInput = scanner.nextLine();

        }
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }
}




