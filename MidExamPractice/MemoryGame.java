package MidExamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
//reading the string of integers from console & converting it to a List.
        Scanner scanner = new Scanner(System.in);
        List<String> numbersList = Arrays.stream((scanner.nextLine().split("\\s+")))
                .collect(Collectors.toList());


//creating the command string & formatting it as an array
        String lineInput = "";
        int movesCount = 0;

        //we are receiving number commands until we receive ''end'' or the list still has elements

        while (!"end".equalsIgnoreCase(lineInput = scanner.nextLine())) {
            movesCount++;
            int[] index = Arrays.stream(lineInput.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
// if they are equal, they should be removed. with command ''get'' we get the value
// of the element at the particular index
            //if elements are equal or out of the list range (under 0, larger than its size)\
            // we need to add new symbols(moves+a) by the middle of the list. We get the middle by dividing the list's size by 2.
            if (index[0] == index[1] ||
                    index[0] < 0 ||
                    index[1] < 0 ||
                    index[0] >= numbersList.size()
                    || index[1] >= numbersList.size()) {
                System.out.println("Invalid input! Adding additional elements to the board");
                numbersList.add(numbersList.size() / 2, "-" + movesCount + "a");
                numbersList.add(numbersList.size() / 2, "-" + movesCount + "a");
                // if they are equal, they should be removed. with command ''get'' we get the value
// of the element at the particular index
            }else{
            if (numbersList.get(index[0]).equals(numbersList.get(index[1]))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", numbersList.get(index[0]));
                numbersList.remove(Math.max(index[0], index[1]));
                numbersList.remove(Math.min(index[0], index[1]));
//if they are not the same, print ;try again!
            } else {
                System.out.println("Try again!");
            }
                if (numbersList.isEmpty()) {
                    System.out.printf("You have won in %d turns!", movesCount);
                    return;
                }

            }
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", numbersList));
    }
}









