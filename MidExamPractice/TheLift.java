package MidExamPractice;
import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //read from console how many people are waiting
int waiting =Integer.parseInt(scanner.nextLine());
// read the lift
        int[] lift = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int peopleInCurrentWagon =0;
int peopleInLift =0;

boolean noPeopleLeft =false;
int maxCapacity =4;
        for (int i = 0; i <lift.length-1 ; i++) {
            while (lift[i]<4){
                lift[i]++;
                peopleInCurrentWagon++;
                if (peopleInCurrentWagon+peopleInLift==waiting){
                    noPeopleLeft=true;
                    break;
                }
            }
            peopleInLift+=peopleInCurrentWagon;
            if (noPeopleLeft){
                break;
            }
            peopleInCurrentWagon=0;

        }
        if (waiting>peopleInLift){
            System.out.printf("There isn't enough space! %d people in a queue!",waiting-peopleInLift);
            for (int element:lift) {
                System.out.println(element+ " ");
            }
            

        }
    }
}




