package ArraysMoreExercise;
import java.util.Arrays;
import  java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int n =Integer.parseInt(scanner.nextLine());
int[] numbers =new int[n];
// encrypt numbers
        for (int i = 0; i <n ; i++) {
            //прочитаме имената и задаваме променлива за дължината им необходима при обхождането
            String sequence =scanner.nextLine();
            int len =sequence.length();
            int sum =0;
            //обхождаме буквите в sequence(името), прочетено от конзолата
            for (int j =0; j<sequence.length();j++){
                //запазваме отделните букви, за да преценим после дали са гласни
                char currentChar =sequence.charAt(j);
                //if vowel of consonant
                //добавяме гласните към сумата за гласни
                if (isVowel(currentChar)){
                    sum +=currentChar*len;
                }else {
                    sum += currentChar/len;
                }
            }
            numbers[i]=sum;
        }
        //sort
        Arrays.sort(numbers);
        //print
        for (int element:numbers) {
            System.out.println(element);
        }

    }
    public static boolean isVowel(char c){
        String vowels ="aeiouAEIOU";
        return vowels.contains((c+""));
    }
    public static boolean isConsanant (char c){
        String cons ="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(c+"");
    }
}




