package Lists;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
public class AppendArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //reading the list
         List<String> arrays =Arrays.stream(scanner.nextLine().split("\\|"))
                         .collect(Collectors.toList());
         //reverse elements in list
        Collections.reverse(arrays);
        //save the reverse in a string to be printed without the |
        String toPrint=arrays.toString().replaceAll("[\\]\\[,]","").trim();
        toPrint=toPrint.replaceAll("\\s+", " ");
        System.out.println(toPrint);
    }
}




