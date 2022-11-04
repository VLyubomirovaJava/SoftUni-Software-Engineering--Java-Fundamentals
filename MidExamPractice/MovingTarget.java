package MidExamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        String lineInput;

        while (!"End".equals(lineInput = scanner.nextLine())) {
            String[] tokens = lineInput.split("\\s+");
            switch (tokens[0]) {

                //•	"Shoot {index} {power}"
                //o	Shoot the target at the index if it exists by reducing its value by the given power
                // (integer value).
                //o	Remove the target if it is shot.
                // A target is considered shot when its value reaches 0.


                case "Shoot":
                    int shotIndex = Integer.parseInt(tokens[1]);
                    if (shotIndex < numbersList.size() && shotIndex >= 0) {
                        numbersList.set(shotIndex, numbersList.get(shotIndex) - Integer.parseInt(tokens[2]));
                        if (numbersList.get(shotIndex) <= 0) {
                            numbersList.remove(shotIndex);
                        }
                    }
                    break;

                case "Add":
                    //•	"Add {index} {value}"
                    //o	Insert a target with the received value at the received index if it exists.
                    int indexAdd = Integer.parseInt(tokens[1]);
                    int value = Integer.parseInt(tokens[2]);

                    if (indexAdd < numbersList.size() && indexAdd >= 0) {
                        //dobavqme na indeksa stoinostta ot komandata
                        numbersList.add(indexAdd,Integer.parseInt(tokens[2]));
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                    //o	Remove the target at the given index and the ones before and after it depending on the radius.
                //o	If any of the indices in the range is invalid, print: "Strike missed!" and skip this command.
                case "Strike":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    int radius = Integer.parseInt(tokens[2]);

                    if (indexToRemove + radius < numbersList.size() &&
                indexToRemove-radius>=0) {
numbersList.subList(indexToRemove-radius,indexToRemove+radius+1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            }
        System.out.print(Arrays.toString(new List[]{numbersList}).replaceAll("[\\[\\]]", "").replaceAll(", ", "|"));
    }
}
       // for (int i = 0; i < numbersList.size(); i++) {
//    //taka postigame kraen rezultat na otdelni chisla + nqma "|" sled poslednoto
//    if (numbersList.size() - 1 == i) {
//        System.out.print(numbersList.get(numbersList.size() - 1));
//       return;
//     }
//      System.out.printf("%d|",numbersList.get(i));        }




