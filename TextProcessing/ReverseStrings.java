package TextProcessing;

import java.util.*;

public class ReverseStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!"end".equals(line)) {// until receiving 'end' we are reading new lines from the console
            String reversed = ""; // creating a String, where I will store the reversed chars

            for (int i = line.length() - 1; i >= 0; i--) {
                char currentSymbol = line.charAt(i);
                reversed += currentSymbol;
            }
            System.out.printf("%s = %s%n", line, reversed);

            line = scanner.nextLine();
        }

        }


        }




