package MidExamPractice;
import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //reading string of int
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        int a = numbersList.size();
        int totalSum = 0;
//finding each element's value and adding it to the sum
        for (int currentElement : numbersList) {
            totalSum += currentElement;
        }
        //finding avgvalue by diving totalsum ot elements by list's size;
        double avgValue = totalSum * 1.0 / numbersList.size();
        List<Integer> topNumbers = new ArrayList<>();
        for (Integer currentNum : numbersList) {
            if (currentNum > avgValue) {
                topNumbers.add(currentNum);
            }
        }
        if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else if (topNumbers.size() < 5) {
            for (Integer currentElement : topNumbers) {
                System.out.printf("%d ", currentElement);
            }
        } else {
            topNumbers = topNumbers.stream()
                    .limit(5)
                    .collect(Collectors.toList());
            for (Integer num : topNumbers) {
                System.out.printf("%d ", num);
            }
        }
    }
}





