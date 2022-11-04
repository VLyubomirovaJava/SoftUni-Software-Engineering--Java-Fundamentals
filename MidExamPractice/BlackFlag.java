package MidExamPractice;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int duration =Integer.parseInt(scanner.nextLine());
int dailyPlunder =Integer.parseInt(scanner.nextLine());
double targetPlunder =Double.parseDouble(scanner.nextLine());
double totalPlunder=0;
        for (int day = 1; day <=duration; day++) {
            totalPlunder+=dailyPlunder;
            if (day%3==0){
                totalPlunder+= dailyPlunder/2.0;
            } if (day%5==0){
                totalPlunder-=totalPlunder*0.3;
            }
        }
        double inPercent =(totalPlunder/targetPlunder)*100;
        if (totalPlunder>=targetPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",totalPlunder);
        }else {
            System.out.printf("Collected only %.2f%% of the plunder.",inPercent);
        }
    }
}




