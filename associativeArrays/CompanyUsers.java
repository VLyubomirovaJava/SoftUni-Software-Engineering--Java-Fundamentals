package associativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> employeesMap = new LinkedHashMap<>();
        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            String[] command = input.split(" -> ");
            employeesMap.putIfAbsent(command[0], new ArrayList<>());
//if the map doesn't have what we have as first item in the command (position zero)

            if (!employeesMap.get(command[0]).contains(command[1])) {
                employeesMap.get(command[0]).add(command[1]);
            }
        }
        employeesMap.forEach((key,value)->{
            System.out.println(key);
            value.forEach(id -> System.out.printf("-- %s%n",id));
        });
    }

}
