package MidExamPractice;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 List<Integer>numbersList =Arrays.stream(scanner.nextLine().split("@"))
                 .map(Integer::parseInt)
                 .collect(Collectors.toList());
 String lineInput = scanner.nextLine();
        int lastPosition =0;

        while (!lineInput.equals("Love!")) {
            String[] commandData = lineInput.split(" ");

int jumplength= Integer.parseInt(commandData[1]);
 for (int i = lastPosition; i < numbersList.size() ; i++) {
int currentIndex =lastPosition + jumplength;
 if (currentIndex>= numbersList.size()){
currentIndex=0;
 }

 if (numbersList.get(currentIndex) == 0) {
     System.out.printf("Place %s already had Valentine's day.%n", currentIndex);
 }else {
     numbersList.set(currentIndex, numbersList.get(currentIndex) - 2);

     if (numbersList.get(currentIndex) <= 0) {
         System.out.printf("Place %s has Valentine's day.%n", currentIndex);
     }
 }
 lastPosition=currentIndex;
 break;
     }
     lineInput= scanner.nextLine();
 }
        System.out.printf("Cupid's last position was %d.%n",lastPosition);
boolean successfulMission =true;
int leftHouses=0;
        for (int house:numbersList) {
            if (house>0){
                successfulMission=false;
                leftHouses++;
        }
        }
        if (successfulMission) {
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.",leftHouses);
        }
    }
}




