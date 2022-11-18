package TextProcessing;

import java.math.BigInteger;
import java.util.*;

public class MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
//multiplying
        System.out.println(first.multiply(second));
    }
}

