package Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandData = command.split("\\s+");

            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(commandData[1]);
                numbersList.add(numberToAdd);

            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(commandData[1]);
                int indexToInsert = Integer.parseInt(commandData[2]);
                if (isValidIndex(indexToInsert, numbersList)&& isValidNum(numberToInsert,numbersList)) {
                    numbersList.add(indexToInsert, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(commandData[1]);
                if (isValidIndex(indexToRemove, numbersList)) {
numbersList.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("left")) {
                int countShiftLeft = Integer.parseInt(commandData[2]);

                //povtoreniqta na deistvieto
                for (int times = 1; times <= countShiftLeft; times++) {
                    //vzimame purvoto chislo ot spisuka
                    int firstNum = numbersList.get(0);
                    //maham go
                    numbersList.remove(0);
                    //slagam chisloto nakraq
                    numbersList.add(firstNum);
                }
            } else if (command.contains("right")) {
                int countRightShifts = Integer.parseInt(commandData[2]);
                for (int times = 1; times <= countRightShifts; times++) {
                    //vzimam poslednoto chislo

                    int lastNum = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size()-1);
                    numbersList.add(0,lastNum);
                }
            }
            command = scanner.nextLine();
        }

        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }

    private static boolean isValidIndex(int indexToInsert, List<Integer> numbersList) {
        return indexToInsert >= 0 && indexToInsert <= numbersList.size()-1;

    }

    private static boolean isValidNum(int numberToInsert, List<Integer> numbersList) {
        return numberToInsert>=0;
    }
}




