package FinalExamPrep;

import java.util.*;

public class TheImitationGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    String message = scanner.nextLine();
        String input = scanner.nextLine();

while  (!input.equals("Decode")){
    String [] command = input.split("\\|");
switch(command[0]) {
    case "Move":
        int num = Integer.parseInt(command[1]);
        String first = message.substring(0, num);
        String second = message.substring(num);
// to make the selected chars appear last
        message = second + first;
        break;
    case "Insert":
        int index = Integer.parseInt(command[1]);
        String value = command[2];
        String firstHalf = message.substring(0, index);
        String secondHalf = message.substring(index);
// to place the value in between the given index and the remainder of the message
        message = firstHalf + value + secondHalf;
        break;
    case "ChangeAll":
        String replaceSub = command[1];
        String replacement = command[2];
        message = message.replace(replaceSub, replacement);
        break;
    default:
        throw new IllegalStateException("Unknown command " + command + " in " + input);
}
        input=scanner.nextLine();
}
        System.out.println("The decrypted message is: "+message);

}

    }
