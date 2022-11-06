package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import  java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
//sum all adjacent equal numbers in a list of decimal numbers, starting from left to right
        Scanner scanner = new Scanner(System.in);
//reading the list from the console
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        //iterate thru the list's elements
        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNum =numbers.get(i);
            double nextNum =numbers.get(i+1);
            if (currentNum==nextNum) {
                //aggregate the number if the index is equal and then reset the loop
                numbers.set(i,currentNum+nextNum);
                numbers.remove(i+1);
                //za da  se vrushta proverkata otnachalo
                i = -1;
            }
        }
            String output = joinElementsByDelimeter(numbers, " ");
            System.out.println(output);
        }


    public static String joinElementsByDelimeter(List<Double> items, String delimeter) {
        String output = "";
        for (Double item : items)
            output += (new DecimalFormat("0.#").format(item) + delimeter);
            return output;
        }
    }









