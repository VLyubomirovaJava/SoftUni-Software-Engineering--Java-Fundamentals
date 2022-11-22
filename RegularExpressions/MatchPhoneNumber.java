package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String phoneNumbers = scanner.nextLine();
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        //+359 задължителни цифри, ([- ]) 1ва група - или интервал, или тире
        //задължителна двойка, след това ми дай това което е от първата група(\\1)
        //задължителни три цифри. Пак задължителните от първата група. завършваме със задълж. 4 цифри
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumbers);
        List<String> correctPhoneNumbers =new LinkedList<>();
        while (matcher.find()) {
correctPhoneNumbers.add(matcher.group()) ;
        }
        System.out.println(String.join(", ",correctPhoneNumbers));
    }
}
