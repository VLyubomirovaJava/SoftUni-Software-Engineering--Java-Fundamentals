package MidExamPractice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        String command = scanner.nextLine();
        while(!command.equals("end")) {
            if (command.contains("swap")) {
                //1. vzimame elementa ot purviq indexi go parsvame ot string kum cqlo chislo
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = numbers[index1];
                //2. vzimame elementa ot vtoriq index
                int element2 = numbers[index2];

                //3. razmqna
                numbers[index1] = element2;
                numbers[index2] = element1;
            }else if (command.contains("multiply")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = numbers[index1];
                int element2 =numbers[index2];
                int product =element1*element2;
                numbers[index1]= product;
} else if (command.contains("decrease")) {
                for (int i = 0; i <= numbers.length-1 ; i++) {
                    numbers[i] --;
                }
            }
            command = scanner.nextLine();
            }
        for (int i = 0; i <= numbers.length-1 ; i++) {
int currentNum =numbers[i];
if (i!=numbers.length-1){
    System.out.print(currentNum + ", ");
} else {
    System.out.print(currentNum);

}
        }
        }
}




