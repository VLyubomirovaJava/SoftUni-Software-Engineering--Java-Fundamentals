package FinalExamPrep;

import java.util.*;

public class WorldTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine(); //Hawai::Cyprys-Greece
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] command = input.split(":");
            String order = command[0];
            switch (order) {
                case "Add Stop":
                    //o	Insert the given string at that index only if the index is valid
                    int index = Integer.parseInt(command[1]);
                    String city = command[2];
                    if (isValidIndex(index, stops)) {
                        // splitting our string in two substrings by the index. Adding the city inbetween
                        String firstHalf = stops.substring(0, index);
                        String secondHalf = stops.substring(index);
                        stops = firstHalf + city + secondHalf;
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                        //	Remove the elements of the string from the starting index to the end index (inclusive)
                        // if both indices are valid
                        String firstHalf = stops.substring(0, startIndex);
                        String secondHalf = stops.substring(endIndex + 1);
                        stops = firstHalf + secondHalf;
                    }
                    break;
                case "Switch"://o	If the old string is in the initial string,
                    // replace it with the new one (all occurrences)
                    String old = command[1];
                    String newEntry = command[2];
                    if (stops.contains(old)) {
                        stops = stops.replace(old, newEntry);
                    }
                    break;
            }
            //Note: After each command, print the current state of the string if it is valid!
            System.out.println(stops);
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }

    private static boolean isValidIndex(int index, String stops) {
        //checking if the index is within the length of our stops string,
        // returning it to the main method
        return index >=0 && index <stops.length();
    }
    }
