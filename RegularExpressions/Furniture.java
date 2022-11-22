package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//>>{furniture name}<<{price}!{quantity}"
        String regex = "^([>]{2})(?<furniture>[\\w]+)[<]{2}(?<price>[\\d]+.[\\d]+)[!](?<quantity>[\\d]+)";
        double total = 0;
        List<String> products = new LinkedList<>();
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String nameFur = matcher.group("furniture");
                Double price = Double.parseDouble(matcher.group("price"));
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
