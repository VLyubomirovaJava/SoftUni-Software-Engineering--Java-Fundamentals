package FinalExam;
import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> guests = new LinkedHashMap<>();
        int unLiked = 0;
        while (!command.equals("Stop")) {
            String[] token = command.split("-");
            String type = token[0];
            String guestName = token[1];
            String mealName = token[2];
            if (type.equals("Like")) {
                List<String> currentMeal = guests.get(guestName);
                if (currentMeal == null) {
                    currentMeal = new ArrayList<>();
                }
                if (!currentMeal.contains(mealName)) {
                    currentMeal.add(mealName);
                }
                guests.put(guestName, currentMeal);
            } else if ("Dislike".equals(type)) {
                List<String> guestMeals = guests.get(guestName);
                if (!guests.containsKey(guestName)) {
                    System.out.println(String.format("%s is not at the party.", guestName));
                }
                if (guests.containsKey(guestName)&&guestMeals.contains(mealName)) {
                    guestMeals.remove(mealName);
                    unLiked++;
                    System.out.println(String.format("%s doesn't like the %s.", guestName,mealName));
                }


                else   if (guests.containsKey(guestName)&&!guestMeals.contains(guestMeals)) {
                    System.out.println(String.format("%s doesn't have the %s in his/her collection.", guestName,mealName
                    ));
                }


            }


            command = scanner.nextLine();
        }
        guests.entrySet().stream().
                forEach(e -> System.out.println(String.format("%s: %s", e.getKey(), printList(e.getValue()))));
        System.out.printf("Unliked meals: %s\n", unLiked);

    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]", "");
    }
}