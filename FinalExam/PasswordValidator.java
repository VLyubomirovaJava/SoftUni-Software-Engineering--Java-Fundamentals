package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] tokens = input.split("\\s+");
int index;
                if (tokens[0].equals("Make")) {

                    index = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("Upper")) {
                        char charToReplace = password.charAt(index);
                        charToReplace = Character.toUpperCase(charToReplace);
                        password.setCharAt(index, charToReplace);
                        System.out.println(password);
                    } else if (tokens[1].equals("Lower")) {
                        char charToReplace = password.charAt(index);
                        charToReplace = Character.toLowerCase(charToReplace);
                        password.setCharAt(index, charToReplace);
                        System.out.println(password);
                    }
                }
                  else   if (tokens[0].equals("Insert")) {
                        index = Integer.parseInt(tokens[1]);
                        char charInsert = tokens[2].charAt(0);
                        int lastIndex = password.length() - 1;
                        if (index < 0 || index > lastIndex) {

                        } else {
                            password.insert(index, charInsert);
                            System.out.println(password);
                        }
                    }
                  else  if (tokens[0].equals("Replace")) {
                        char toReplace = tokens[1].charAt(0);
                        String replace = tokens[1];
                        int value = Integer.parseInt(tokens[2]);
                        int asciiSymbol = toReplace;
                        int sum = asciiSymbol + value;
                        char newReplace = (char) sum;

                        if (password.toString().contains(replace)) {
                            while (password.toString().contains(replace)) {
                                String text = password.toString().replace(replace, String.valueOf(newReplace));
                                password.replace(0, password.length(), text);
                                System.out.println(password);
                            }
                        } else {
                            break;
                        }
                    }
                    else if (tokens[0].equals("Validation")) {
                        String regex1 = "\\w+";

                        Pattern pattern1 = Pattern.compile(regex1);
                        Matcher matcher1 = pattern1.matcher(password);

                        String regex2 = "\\d+";
                        Pattern pattern2 = Pattern.compile(regex2);
                        Matcher matcher2 = pattern2.matcher(password);

                        if (password.length() < 8) {
                            System.out.println("Password must be at least 8 characters long!");
                        }
                        if (!matcher1.find()) {
                            System.out.println("Password must consist only of letters, digits and _!");

                        }
                        if (password.toString().chars().noneMatch(Character::isUpperCase)) {
                            System.out.println("Password must consist at least one uppercase letter!");
                        }
                        if (password.toString().chars().noneMatch(Character::isLowerCase)) {
                            System.out.println("Password must consist at least one lowercase letter!");
                        }
                        if (!matcher2.find()) {
                            System.out.println("Password must consist at least one digit!");
                        }
                    }

                       else {
                    return;
            }
            input = scanner.nextLine();
        }
    }
}