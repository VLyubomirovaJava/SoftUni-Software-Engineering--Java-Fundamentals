package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;
//Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
// In case of no elements left in the list, print "empty".
public class RemoveNegativesAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

numbersList.removeIf(n->n<0);
    Collections.reverse(numbersList);
        if (numbersList.size()==0) {

            System.out.println("empty");

        } else {
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}





