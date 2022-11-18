package TextProcessing;

import java.util.*;

public class DigitsLettersAndOther {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder digitSb = new StringBuilder();
        StringBuilder LetterSb = new StringBuilder();
        StringBuilder OtherSb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)) {
                //    if (symbol >= '0' && symbol <= '9') {
                digitSb.append(symbol);
            } else if (Character.isLetter(symbol)) {
                LetterSb.append(symbol);
                //} else if (symbol>='A'&& symbol<='Z'||symbol>='a'&& symbol<='z') {
            } else {
                OtherSb.append(symbol);
            }
        }
        System.out.println(digitSb);
        System.out.println(LetterSb);
        System.out.println(OtherSb);
    }
}