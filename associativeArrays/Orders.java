package associativeArrays;

import java.util.*;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
Map<String,Double> productPrice =new LinkedHashMap<>();
// product-> price per product
        Map<String,Integer> productQuantity =new LinkedHashMap<>();
        //product -> quantity
        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double pricePerProduct =Double.parseDouble(input.split(" ")[1]);
            int quantity =Integer.parseInt(input.split(" ")[2]);
            productPrice.put(product,pricePerProduct);
            if (!productQuantity.containsKey(product)){
                productQuantity.put(product,quantity);
            }else {
                productQuantity.put(product,productQuantity.get(product)+quantity);

            }
            input= scanner.nextLine();
        }
        for(Map.Entry<String,Double>entry: productPrice.entrySet()){
            //кий (име на продукта)->value цена
            //цена * количеството
          String productName= entry.getKey();
          double finalSum= entry.getValue()* productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n",productName,finalSum);
        }



    }
    }
