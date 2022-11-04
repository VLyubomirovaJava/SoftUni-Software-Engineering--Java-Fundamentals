package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int[] arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
int n1 =arr.length;
        System.out.println(findElement(arr,n1));

    }
public static int findElement(int[] arr, int n){
    List<Integer>list
            =Arrays.stream(arr).boxed().collect(Collectors.toList());
    for (int i = 1; i <=n ; i++) {
        int leftSum =list.subList(0,i)
                .stream()
                .mapToInt(x->x)
                .sum();
        int rightSum =list.subList(i+1,n)
                .stream()
                .mapToInt(x->x)
                .sum();
        if (leftSum==rightSum)
            return list.get(i);
    }
    return  -1;
}

}




