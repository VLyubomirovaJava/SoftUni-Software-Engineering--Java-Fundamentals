package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //•	Split the input string (by space) and create an array of words.
String []words = scanner.nextLine().split(" ");
// Create a random number generator - an object rnd of type Random.
        Random rnd =new Random();
        for (int position1 = 0; position1 < words.length-1 ; position1++) {
            //swapping word position from 1 to 2
int position2 = rnd.nextInt(words.length);
int position3 = rnd.nextInt(words.length);
String oldWordX=words[position2];
words[position2]=words[position3];
words[position3]=oldWordX;
        }
        //razdelitel na elementite po nov red
        System.out.println(String.join(System.lineSeparator(),words));
    }
}




