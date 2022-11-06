package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
//On the next n lines, you will receive how many people will get on that wagon.
// In the end, print the whole train and the sum of the people on the train.
        Scanner scanner = new Scanner(System.in);

int countWagons =Integer.parseInt(scanner.nextLine());
//people that are being onboarded
      int [] wagons = new int[countWagons];
        for (int wagon = 0; wagon < countWagons; wagon++) {
int countPeople =Integer.parseInt(scanner.nextLine());
wagons[wagon]=countPeople;
        }
        int sum =0;
        // to get the elements from the array

        for (int number:wagons) {
            System.out.print(number+ " ");
            sum +=number;
        }
        System.out.println();
        System.out.println(sum);
    }
}




