package MidExamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //phones -- samsung.. motorala
        List<String> phones = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        //command we receive
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("End")) {
            String[] commandParts = command.split(" - ");
            switch (commandParts[0]) {

                case "Add":
                    String bookToAdd = commandParts[1];
                    if (!phones.contains(bookToAdd)) {
                        phones.add(bookToAdd);
                    }
                    break;
                case "Remove":
                    String phoneToRemove = commandParts[1];
                    if (phones.contains(phoneToRemove)) {
                        phones.remove(phoneToRemove);
                    }
                    break;
                case "Bonus phone":
                    String [] parsePhones =commandParts[1].split(":");
                    String oldphone = parsePhones[0];
                    String newphone = parsePhones[1];
                    if (phones.contains(oldphone)) {
                        phones.add(phones.indexOf(oldphone) + 1, newphone);
                    }
                    break;
                case "Last":
                    String lastPhone = commandParts[1];
                    if (phones.contains(lastPhone)) {
                        phones.remove(lastPhone);
                        phones.add(lastPhone);
                        break;
                    }
            }
            command = scanner.nextLine();
        }
        //After receiving "End" command, print the phones in your storage, separated by ", " (comma and space)
        System.out.println(phones.toString().replaceAll("[\\[\\]]", ""));
    }
}

