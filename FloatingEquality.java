package Arrays;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that safely compares floating-point numbers (double) with precision eps = 0.000001.
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        compareDouble(n1, n2);
    }

    static void compareDouble(double n1, double n2) {
        if (Math.abs(n1 - n2) <= 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
