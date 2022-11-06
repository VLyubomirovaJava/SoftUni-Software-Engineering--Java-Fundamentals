package associativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String[] words =scanner.nextLine().split(" ");
        LinkedHashMap<String,Integer> counts = new LinkedHashMap<>();
        for (String word:words) {
            String wordInLowerCase =word.toLowerCase();
            //Pass through all elements in the array and count each word:
            if (counts.containsKey(wordInLowerCase)){
                counts.put(wordInLowerCase, counts.get(wordInLowerCase)+1);
                }else {
                counts.put(wordInLowerCase,1);
            }
        }
        //Create a new ArrayList (String), which will hold all the words with odd occurrences:
        ArrayList<String> odds =new ArrayList<>();
        for (var entry:counts.entrySet()) {
if (entry.getValue()%2 ==1){
    odds.add(entry.getKey());
}
        }
        for (int i = 0; i <odds.size() ; i++) {
            System.out.print(odds.get(i));
            if (i< odds.size()-1){
                System.out.print(", ");
            }
        }
    }
}




