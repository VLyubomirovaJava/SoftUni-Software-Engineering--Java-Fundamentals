package DataTypesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();     // "1234 5678"
            String[] parts = input.split(" ");
            String part1 = parts[0];               // "1234"
            String part2 = parts[1];               // "5678"
            long number1 = Long.parseLong(part1);  // 1234
            long number2 = Long.parseLong(part2);  // 5678
            long biggest = Math.max(number1, number2);  // 5678
            System.out.println(getSum(biggest));

        }
    }

    public static long getSum(long biggest){
        int sum=0;
        while (biggest !=0){
            sum= Math.toIntExact(sum + biggest % 10);
            biggest = biggest /10;
        }
        return sum;
    }
}