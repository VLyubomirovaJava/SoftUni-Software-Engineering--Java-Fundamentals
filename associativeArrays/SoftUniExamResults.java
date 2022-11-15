package associativeArrays;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pointsStat = new LinkedHashMap<>();
        Map<String, Integer> languageStat = new LinkedHashMap<>();
        String input= scanner.nextLine();
        while (!input.equals("exam finished")) {
            // format of the input "{username}-{language}-{points}
          //  0 1 2
            String[] command = input.split("-");
//{username}-banned".  we remove the user, but preserve their submission
            String name =command[0];
            String language =command[1];
            if (command[1].equals("banned")) {
                pointsStat.remove(name);
                input= scanner.nextLine();
                continue;
            }
            int score =Integer.parseInt(command[2]);
            pointsStat.putIfAbsent(name,0);
            if (pointsStat.get(name)<score){
                //we add their score if it's lower than what's in the command it takes its value
                pointsStat.put(name,score);
            }
            //add the language to the map, if it's not on there yet
            languageStat.putIfAbsent(language,0);
            //to increase the count of progr. languages if we already have this language in the map
            languageStat.put(language,languageStat.get(language)+1);
            input= scanner.nextLine();

        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> e : pointsStat.entrySet()) {
            System.out.println(e.getKey() + " | " + e.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> z : languageStat.entrySet()) {
            System.out.println(z.getKey() + " - " + z.getValue());
        }
    }
}