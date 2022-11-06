package associativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//using LinkedHashMap to keep track of the words
        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            words.putIfAbsent(word, new ArrayList<>());
//adding the synonym as value to the word in the list
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));

        }
    }
}



