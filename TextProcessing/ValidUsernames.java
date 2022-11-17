package TextProcessing;

import java.util.*;

public class ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//1. входни данни
        String input = scanner.nextLine();
        String[] usernames = input.split(", ");
        // 2. проверка дали тези данни са валидни
        for (String username : usernames) {
            //ако нашият username е валиден, отпечатваме го
            if (isValidateUsername(username)) {
                System.out.println(username);
            }
        }
    }

    //метод който проверява дали  username e валидно
    public static boolean isValidateUsername(String username) {
        //1. валидна дължина (3;16)
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;

        //2. валидно съдържание -> букви, цифри, тирета..
        boolean isValidContent = false;
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                // невалиден символ -> невалиден username
                return false;
            }
        }
            // всички символи и всички букви са валидни
            isValidContent = true;
            return isValidContent && isValidLength;
        }
    }


