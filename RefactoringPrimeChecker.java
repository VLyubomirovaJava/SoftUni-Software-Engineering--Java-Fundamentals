package Arrays;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//You are given a program that checks if numbers in a given range [2...N] are prime.
// For each number is printed "{number} -> {true or false}".
// The code, however, is not very well written.
// Your job is to modify it in a way that is easy to read and understand.

        int number = Integer.parseInt(scanner.nextLine());
        boolean isPrime = false;
        for (int i = 2; i <= number; i++) {
            isPrime=true;
            for (int separator = 2; separator < i ; separator++) {
                //condition for non prime numb
                if (i % separator == 0) {
                    isPrime = false;
                    break;
                }
            }

                    System.out.printf("%d -> %b%n", i, isPrime);

            }
        }
    }












