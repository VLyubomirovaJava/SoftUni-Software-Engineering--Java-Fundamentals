package Lists;
import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Read a number n and n lines of products.
// Print a numbered list of all the products ordered by name.

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentProduct = scanner.nextLine();
            productList.add(currentProduct);

        }
        Collections.sort(productList);
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i+1+"."+productList.get(i));
        }
    }
}



