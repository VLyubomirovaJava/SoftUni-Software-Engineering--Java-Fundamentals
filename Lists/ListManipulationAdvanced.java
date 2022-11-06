package Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] tokens = lineInput.split(" ");
            String command = tokens[0];

            switch (command) {
                //Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"

                case "Contains":
                    int containedNum = Integer.parseInt(tokens[1]);
                    containsNumber(numbersList, containedNum);
                    break;

                //Print even – print all the numbers that are even separated by a space
                //Print odd – print all the numbers that are oddly separated by a space
                case "Print":
                    if (tokens[1].equals("even")) {
                        printEvenNum(numbersList);
                    } else {
                        printOdds(numbersList);
                    }
                    break;

                //Get sum – print the sum of all the numbers
                case "Get":
                    printSumOfNums(numbersList);
                    break;
                case "Filter":
                    int filteredNum = Integer.parseInt(tokens[2]);
                    filterNums(numbersList, tokens[1], filteredNum);
break;
            }

            lineInput= scanner.nextLine();

        }
    }






    //method to check if a number is within the list by using a boolean

    public static void containsNumber(List<Integer> numbersList, int containedNum) {
     if (numbersList.contains(containedNum)){
         System.out.println("Yes");
            }else {
         System.out.println("No such number");
        }
    }

    //method to print all even from list. we call it by using it's name within the switch
    public static void printEvenNum(List<Integer> numbersList){
        //proverka za even chisla
        for (int num:numbersList) {
            if (num % 2 ==0){
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }
    //method to print all odds within list
    public static void printOdds (List<Integer> numbersList){
        for (int num:numbersList) {
            if (num %2 !=0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    //method to sum all numbers within the list
    public static void printSumOfNums(List<Integer> numbersList){
        int sum =0;
        for (int num:numbersList) {
            sum +=num;
        }
        System.out.println(sum);
        }
        public static  void filterNums(List<Integer> numbersList,String condition, int filteredNum){
        switch (condition){
            case    "<":
                for (int num:numbersList) {
                    if (num<filteredNum){
                        System.out.print(num + " ");
                    }
                }
                break;
            case ">":
                for (int num : numbersList) {
                    if (num > filteredNum){
                        System.out.print(num + " ");
                    }
                }
                break;
            case ">=":
                for (int num : numbersList) {
                    if (num >= filteredNum){
                        System.out.print(num + " ");
                    }
                }
                break;
            case "<=":
                for (int num : numbersList) {
                    if (num <= filteredNum){
                        System.out.print(num + " ");
                    }
                }
                break;
        }
            System.out.println();

    }
}





