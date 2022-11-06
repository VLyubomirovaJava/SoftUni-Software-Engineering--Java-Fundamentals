package Lists;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 List<Integer> numbers =Arrays.stream(scanner.nextLine().split(" "))
                 .map(Integer::parseInt)
                 .collect(Collectors.toList());

 //izvejdame goleminata v otdelna promenliva, za da ne se promenq sled vsqka iteraciq, ako triem elementi

 int length =numbers.size();

 //za da ogranichim iteraciite do 2
        for (int i = 0; i <length/2 ; i++) {
int firstNum = numbers.get(i);
int secondNum = numbers.get(numbers.size()-1);
//zadavame sumata na dvete int kato purvi index
numbers.set(i,firstNum+secondNum);
//mahame posleden index
numbers.remove(numbers.size()-1);
        }
        //obhojdame novite elementi na lista i gi printirame sus space
        for (int element:numbers) {
            System.out.print(element+" ");
        }

    }
}




