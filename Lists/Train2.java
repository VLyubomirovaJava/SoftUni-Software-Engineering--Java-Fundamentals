package Lists;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Train2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons =  Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] commandData = lineInput.split(" ");
            String command = commandData[0];
            if ("Add".equals(command)) {
                int numberToAdd = Integer.parseInt(commandData[1]);
                wagons.add(numberToAdd);
            } else {
                int passengersToAdd = Integer.parseInt(commandData[0]);
                for (int index = 0; index < wagons.size(); index++) {
                    int currentWagon = wagons.get(index);
                    if (currentWagon + passengersToAdd <= maxCapacity) {
                        wagons.set(index, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
            lineInput = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
        }




