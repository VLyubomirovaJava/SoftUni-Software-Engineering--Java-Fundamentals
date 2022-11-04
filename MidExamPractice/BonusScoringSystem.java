package MidExamPractice;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// number of students
        int studentsCount = Integer.parseInt(scanner.nextLine());
        //total lectures
        int totalLectures = Integer.parseInt(scanner.nextLine());
        //additional bonus
        int bonus = Integer.parseInt(scanner.nextLine());
        double max = 0;
        double maxBonus = 0;

//The bonus is calculated with the following formula:
//{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})

        for (int currentStudent = 0; currentStudent < studentsCount; currentStudent++) {
            double attendances = Double.parseDouble(scanner.nextLine());
            if (attendances > max) {
                max = attendances;
                maxBonus = attendances / totalLectures * (5 + bonus);
            }
        }
//rounding  to the nearest larger number
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.",max);
    }
}




