package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 List<Integer> list1 =Arrays.stream(scanner.nextLine().split(" "))
                 .map(Integer::parseInt)
                 .collect(Collectors.toList());

        List<Integer> list2 =Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//suzdavame obshtiq list
        List<Integer> resultList =new ArrayList<>();
        
                int minSize =Math.min(list1.size(), list2.size());
        for (int i = 0; i <minSize ; i++) {
            int numFirstList =list1.get(i);
            int numSecondList =list2.get(i);
//za da dobavqme posledovatelno chislata i ot list1, i ot list2
            resultList.add(numFirstList);
            resultList.add(numSecondList);
        }
        if (list1.size()> list2.size()){
            //dobavi mi vs elementi ot podkolekciqta ot izbranata kolekciq. ot 6 element natatyk
            resultList.addAll(list1.subList(minSize,list1.size()));
        } else if (list2.size()> list1.size()) {
            resultList.addAll(list2.subList(minSize, list2.size()));
        }
        //zameni mi skobite s nikakuv string, printirame bez dopuln. simvoli elementite ot lista
        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));

    }
}




