package MidExamPractice;
import java.util.Scanner;

public class HuntingGames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int adventureDays =Integer.parseInt(scanner.nextLine());
int playersCount =Integer.parseInt(scanner.nextLine());
double groupEnergy =Double.parseDouble(scanner.nextLine());
// water +Food per day for one person
        double waterPerDay =Double.parseDouble(scanner.nextLine());
        double foodPerDay =Double.parseDouble(scanner.nextLine());

        //finding total water days *players *water per day
double totalWater =adventureDays * playersCount *waterPerDay;
//finding total food same way
        double totalFood =adventureDays * playersCount * foodPerDay;
        int waterDay =0;
        int foodDay =0;


            for (int day = 1; day <= adventureDays; day++) {
                double energyLossWood = Double.parseDouble(scanner.nextLine());
                waterDay++;
                foodDay++;
                groupEnergy -= energyLossWood;
                if (waterDay % 2==0) {
                    // they drink water, which is dropping the total water by 30%
                    totalWater -= totalWater * 0.3;
                    //energy boost of 5 percent from drinking water
                    groupEnergy += groupEnergy * 0.05;
                    waterDay = 0;
                }
                if (foodDay % 3==0) {
                    //
                    totalFood -= totalFood / playersCount;

                    //raising energy by 10%
                    groupEnergy += groupEnergy * 0.1;
                    foodDay = 0;
                }
                if (groupEnergy <= 0.0) {
                    break;
                }
            }
            if (groupEnergy>=1.0){
                System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);
            }else {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",totalFood,totalWater);
            }

            }
        }





