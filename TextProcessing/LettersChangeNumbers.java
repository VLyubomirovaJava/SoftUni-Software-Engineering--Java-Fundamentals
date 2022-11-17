package TextProcessing;

import java.util.*;

public class LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
String [] codes= input.split("\\s+"); // to get them separated
        double totalSum =0; // sum from all codes
        for (String code:codes) {
            //код: {буква} {число} {буква}

            //модифицирам числото в кода спрямо буквите
            double modifiedNumber =getModifiedNumber(code);
            //добавям модифицираното число към сумата
            totalSum+=modifiedNumber;
        }
        System.out.printf("%.2f",totalSum);
    }
//метод, който връща модифицираното число от кода
    private static double getModifiedNumber(String code) {
        //код: {буква} {число} {буква}
char firstLetter =code.charAt(0);
        char secondletter =code.charAt(code.length()-1);
                double number =Double.parseDouble(code.replace(firstLetter,' ')//12b
                        .replace(secondletter, ' ') // 12
                        .trim());//"12"->12.0

        //проверка за първа буква-> главна(ascii 65--90), или малка
        if(Character.isUpperCase(firstLetter)){
            int positionUpperLetter =(int) firstLetter -64;
            number /=  positionUpperLetter;
        }else {
            int positionLowerLetter = (int)firstLetter -96;
                    number *= positionLowerLetter;
        }
        //2. проверка за втората буква -главна, или малка
        if(Character.isUpperCase(secondletter)){
            int positionUpperLetter =(int) secondletter -64;
            number -=  positionUpperLetter;
        }else {
            int positionLowerLetter = (int)secondletter -96;
            number += positionLowerLetter;
        }
        //връщам модифицираното число
        return number;

    }
    }
