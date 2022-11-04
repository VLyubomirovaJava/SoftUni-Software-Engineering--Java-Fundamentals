package MidExamPractice;
import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int worker1Efficiency =Integer.parseInt(scanner.nextLine());
int worker2Efficiency =Integer.parseInt(scanner.nextLine());
int worker3Efficiency =Integer.parseInt(scanner.nextLine());
int studentsCount =Integer.parseInt(scanner.nextLine());
int servicedStudents =0;
double studentsPerHourSum= (worker1Efficiency+worker2Efficiency+worker3Efficiency) ;
int time =0;
   while (studentsCount>0){
       studentsCount-=studentsPerHourSum;
       time++;
       if (time%4==0){
           time++;
    }
        }
        System.out.printf("Time needed: %dh.",time);
    }
}




