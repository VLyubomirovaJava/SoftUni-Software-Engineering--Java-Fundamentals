package Arrays;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
//•	On the next n lines – you will receive lower and uppercase characters from the Latin alphabet.
        for (int i = 1; i <= lines; i++) {
            char x = scanner.next().charAt(0);
            if (key <= 20 && key >= 0) {
                char x1 = (char) (x + key);
                System.out.print(x1);
            }
        }
    }
}




