package FinalExamPrep;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//"{piece}|{composer}|{key}"
        String input = scanner.nextLine();
        Map<String, List<String>> parts = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = input.split("\\|");
            String piece = tokens[0];
            String composer = tokens[1];
            String key = tokens[2];

            if (!parts.containsKey(piece)) {
                parts.put(piece, new ArrayList<>());
                parts.get(piece).add(composer);
                parts.get(piece).add(key);
            }

            input = scanner.nextLine();
        }
        while (!input.equals("Stop")) {
            String[] data = input.split("\\|");
            String command = data[0];
            switch (command) {
                case "Add"://Add|{piece}|{composer}|{key}":
                    if (!parts.containsKey(data[1])) {
                        parts.put(data[1], new ArrayList<>());// adding the piece and creating a list to contain the rem. defining features
                        parts.get(data[1]).add(data[2]);// adding the composer
                        parts.get(data[1]).add(data[3]); // adding the key
                        System.out.printf("%s by %s in %s added to the collection!%n", data[1], data[2], data[3]);
                    } else {
                        System.out.printf("%s is already in the collection!%n", data[1]);
                    }
                    break;

                case "Remove": //•	"Remove|{piece}":
                    if (parts.containsKey(data[1])) {// if we have it, we remove it
                        parts.remove(data[1]);
                        System.out.printf("Successfully removed %s!%n", data[1]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", data[1]);
                    }
                    break;

                case "ChangeKey"://ChangeKey|{piece}|{new key}":
                    if (parts.containsKey(data[1])) {// if we have it, we remove it
                        parts.get(data[1]).set(1,data[2]);
// replacing og.entry with newly given one
                        System.out.printf("Changed the key of %s to %s!%n", data[1], data[2]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", data[1]);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
            for (Map.Entry<String, List<String>> entry : parts.entrySet()) {
                System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
            }

        }
    }

