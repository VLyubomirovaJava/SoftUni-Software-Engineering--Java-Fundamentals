package Lists;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
String lineInput =scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] tokens = lineInput.split(" ");
String command =tokens[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbersList.add(numberToAdd);
                    break;

                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbersList.remove(Integer.valueOf(numberToRemove));
                    break;

                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbersList.remove(indexToRemove);
                    break;

                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToAdd = Integer.parseInt(tokens[2]);
                    numbersList.add(indexToAdd, numberToInsert);
                    break;
                //Add {number}: add a number to the end of the list
                //Remove {number}: remove a number from the list
                //RemoveAt {index}: remove a number at a given index
                //Insert {number} {index}: insert a number at a given index
            }
            lineInput= scanner.nextLine();
        }

            System.out.println(numbersList.toString()
                    .replaceAll("[\\[\\],]", ""));
        }
    }





