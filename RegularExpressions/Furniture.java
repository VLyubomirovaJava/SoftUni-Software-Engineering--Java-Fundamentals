package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> products = new LinkedList<>();
//>>{furniture name}<<{price}!{quantity}"
        String regex = "^>>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        double total = 0;
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String nameFur = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                products.add(nameFur);
                total += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        products.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", total);
    }
}
