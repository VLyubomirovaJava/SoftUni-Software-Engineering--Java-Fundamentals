package MidExamPractice;
import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //stuff needed for a month
double foodKg =Double.parseDouble(scanner.nextLine());
double hayKg =Double.parseDouble(scanner.nextLine());
double coverKg =Double.parseDouble(scanner.nextLine());
double weightInKg =Double.parseDouble(scanner.nextLine());


double foodInGrams =foodKg*1000;
double hayInGrams =hayKg*1000;
double coverInGrams =coverKg*1000;
double weightInGrams =weightInKg*1000;


boolean isNotEnough =false;
        for (int day = 1; day <=30 ; day++) {
            foodInGrams=foodInGrams-300;
            if (day%2==0) {
                double currentHay = foodInGrams * 0.05;
                hayInGrams = hayInGrams - currentHay;
            }
                if (day%3==0){
                    double currentCover = weightInGrams /3;
                    coverInGrams =coverInGrams-currentCover;
                }
                if (foodInGrams<=0 || hayInGrams<=0 || coverInGrams<=0){
                    isNotEnough=true;
                    break;
            }
        }
        if (isNotEnough){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodInGrams/1000,hayInGrams/1000,coverInGrams/1000);
        }
    }
}




