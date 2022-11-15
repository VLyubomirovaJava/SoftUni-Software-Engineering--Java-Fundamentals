package associativeArrays;

import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
//ресурс -> сума от количество
        String resource = scanner.nextLine();
        //resource or stop;
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            //проверка ако имам такъв ресурс
            //проверка ако нямам
            if (!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            } else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, quantity + currentQuantity);
            }
            resource = scanner.nextLine();
        }
        resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
    }
