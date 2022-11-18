package TextProcessing;

import java.util.*;

public class TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String [] banned =scanner.nextLine().split(", ");
String text = scanner.nextLine();
        for (String banWord:banned) {
            if (text.contains(banWord)){
                String replacement =repeatStr("*",banWord.length());
                //replace() a word with a sequence of asterisks of the same length
                text=text.replace(banWord,replacement);
            }
        }
        System.out.print(text);
    }

    private static String repeatStr(String str, int length) {
        String replacement ="";
        for (int i = 0; i <length ; i++) {
            replacement+=str;
        }
        return replacement;
    }
    }
