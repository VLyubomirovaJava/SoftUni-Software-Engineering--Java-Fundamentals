package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("\\|(?<boss>[A-Z]{4,})\\|\\S*:#(?<title>[A-Za-z]+ [a-zA-Z]+)#");
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher match = pattern.matcher(text);
            if (match.find()) {
                System.out.println((String.format("%s, The %s\n" +
                                ">> Strength: %s\n" +
                                ">> Armor: %s", match.group("boss"),
                        match.group("title"),
                        match.group("boss").length(),
                        match.group("title").length())));
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}

