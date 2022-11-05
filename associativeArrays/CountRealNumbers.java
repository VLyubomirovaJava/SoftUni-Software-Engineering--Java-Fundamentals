package associativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
double[] numbersArr =Arrays.stream(scanner.nextLine().split(" "))
        .mapToDouble(Double::parseDouble).toArray();
//82282
       // /8-2
                TreeMap<Double,Integer>countMap =new TreeMap<>();
        for (double num:numbersArr) {
            //the key is "num"
            if (!countMap.containsKey(num)){
                // if we don't have the key, we set its value to 1
                countMap.put(num,1);
            }else {
                //if we have the key, we increase its value by 1 to reflect how many times we have it  in the ''list''
                int value = countMap.get(num);
                countMap.put(num,value+1);
            }
            }

for (Map.Entry<Double,Integer>entry:countMap.entrySet())  {
    System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
}
    }
}

 // for (int num :numbersArr){
//countMap.putIfAbsent(num,0);
          // countMap.put(num, countMap.get(num)+1);


