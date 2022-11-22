package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//dd{separator}MMM{separator}yyyy
String regex = "\\b(?<day>\\d{2})(\\.|\\/|\\-)(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String dates = scanner.nextLine();
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dates);
        while (matcher.find()){
            String day =matcher.group("day");
            String month =matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }
    }
}