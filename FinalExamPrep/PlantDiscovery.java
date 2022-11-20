package FinalExamPrep;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//info about the plants "{plant}<->{rarity}
        Map<String, Integer> plants = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);
            //adding them in our map
            plants.put(plant, rarity);
        }
        //creating map for plants'rates
        Map<String, Double> plantRates = new TreeMap<>();
        // setting empty values.. for now :)
        for (String s : plants.keySet()) {
            plantRates.put(s, 0.0);
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] tokens = command.split(": ");
            String order = tokens[0];
            String text = tokens[1];
            switch (order) {
                case "Rate":
                    String[] textToChange = text.split(" - ");
                    String plant = textToChange[0];
                    int rate = Integer.parseInt(textToChange[1]);
                    if (plants.containsKey(plant)) {
                        double oldRating = plantRates.get(plant);
                        double newRating = 0.0;
                        if (oldRating == 0.0) {
                            newRating = rate;
                        } else {
                            newRating = (oldRating + rate) / 2;
                        }
                        plantRates.put(plant, newRating);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Update": // updating the rarity of a plant with a new one from command
                    String[] textToSplit = text.split(" - ");
                    plant = textToSplit[0];
                    int newRarity = Integer.parseInt(textToSplit[1]);
                    if (plants.containsKey(plant)) {
                        plants.put(plant, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset": // resetting rating of the plant if included in our map
                    plant = text;
                    if (plantRates.containsKey(plant)) {
                        plantRates.put(plant, 0.0);
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            command=scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plants.entrySet().
                stream().
                sorted((f,s)->s.getValue().compareTo(f.getValue())).
                forEach(e->
                        System.out.printf("-%s; Rarity: %d; Rating: %.2f%n",e.getKey(),e.getValue(),plantRates.get(e.getKey())));

    }
}
