package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BigFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

int number =Integer.parseInt(scanner.nextLine());
        BigInteger factorial =BigInteger.ONE;
        for (int i = 1; i <=number ; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
            System.out.println(factorial);
        }
    }





