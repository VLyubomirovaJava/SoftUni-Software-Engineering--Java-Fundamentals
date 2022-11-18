package TextProcessing;

import java.util.*;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String [] input = scanner.nextLine().split(" ");
String first =input[0];
String second =input[1];
long sum =calculateSum(first,second);
        System.out.println(sum);
    }

    private static long calculateSum(String first, String second) {
        char [] firstArr = first.toCharArray();
        char [] secondArr = second.toCharArray();
        long sum =0;
        int minLength =Math.min(firstArr.length,secondArr.length);
        int maxLength =Math.max(firstArr.length, secondArr.length);
        for (int i = 0; i <minLength ; i++) {
            sum +=firstArr[i] * secondArr[i];
        }
        if (maxLength== firstArr.length){
            for (int i = minLength; i <maxLength ; i++) {
                sum+=firstArr[i];
            }
        }
        else {
            for (int i = minLength; i <maxLength ; i++) {
                sum+= secondArr[i];
            }
        }
        return sum;
    }
    }
