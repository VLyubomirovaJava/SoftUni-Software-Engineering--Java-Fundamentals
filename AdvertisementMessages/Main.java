package AdvertisementMessages;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int messagesCount = Integer.parseInt(scanner.nextLine());
        String []phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String [] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors =  {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
String [] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        // Create a random number generator - an object rnd of type Random.
        Random rnd =new Random();
        for (int i = 0; i <messagesCount ; i++) {
int phrase =rnd.nextInt(phrases.length);
int event =rnd.nextInt(events.length);
int author =rnd.nextInt(authors.length);
int city =rnd.nextInt(cities.length);
            System.out.printf(String.join(" ",phrases[phrase]+" ",events[event]+
                    " ",authors[author]+"-",cities[city]));
        }
    }
}




