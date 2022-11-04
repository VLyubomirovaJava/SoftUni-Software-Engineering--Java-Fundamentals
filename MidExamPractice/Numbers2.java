package MidExamPractice;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("Finish")) {
            String[] tokens = lineInput.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbersList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbersList.remove(Integer.valueOf(numberToRemove));
                    break;

                case "Replace":
                    int numToReplace = Integer.parseInt(tokens[1]);
                    int replacement = Integer.parseInt(tokens[2]);
                    if (numbersList.contains(numToReplace)) {
                        numbersList.set( numbersList.indexOf(numToReplace) , replacement);
                        }
                        break;
                        case "Collapse":
                            int valueCollapse = Integer.parseInt(tokens[1]);
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (numbersList.get(i) < valueCollapse) {
                                    numbersList.remove(i);
                                    i--;
                                }
                            }
                            break;
                    }
                    lineInput = scanner.nextLine();
            }
            System.out.println(numbersList.toString()
                    .replaceAll("[\\[\\],]", ""));
        }
    }






