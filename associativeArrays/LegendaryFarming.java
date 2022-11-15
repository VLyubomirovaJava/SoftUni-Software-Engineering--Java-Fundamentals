package associativeArrays;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        {{
//add the 3 valuable types of materials to the key map and set their current value (quantity) to zero.
               keyMaterials.put("shards", 0);
            keyMaterials.put("fragments", 0);
            keyMaterials.put("motes", 0);
            }};
        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isObtained = false;

        while (!isObtained) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i += 2) {

                String key = input[i + 1].toLowerCase();
                int value = Integer.parseInt(input[i]);
                // to add the materials to their map, if received in input
                if (key.equals("shards") || key.equals("fragments") || key.equals("motes")) {
                    keyMaterials.put(key, keyMaterials.get(key) + value);
//
                    if (keyMaterials.get(key) >= 250) {
                        keyMaterials.put(key, keyMaterials.get(key) - 250);

                        if (key.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");

                        } else if (key.equals("fragments")) {
                            System.out.println("Valanyr obtained!");

                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                    } else {
                        junk.put(key, !junk.containsKey(key) ? value : junk.get(key) + value);
                    }
                }
            }
        keyMaterials.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
        junk.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));

    }
}

