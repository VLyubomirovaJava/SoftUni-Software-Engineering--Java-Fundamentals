package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int currentCount = 1; currentCount <= countStudents; currentCount++) {
            String studentData = scanner.nextLine();
            //first name + last name + grade
            String[] dataParts = studentData.split(" ");
            String firstName = dataParts[0];
            String lastName = dataParts[1];
            Double grade = Double.parseDouble(dataParts[2]);
            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
            //za da napravim spisuk ot studentite
        }
        //    1. sortirame p0 ocenka lista( vzimame stoinosta ot metoda get grade i gi sravnqvame)
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        //reversed se dobavq zashtoto sortiraneto e po ascending, a po uslovie ni trqbva descending

        //  2.otpechatvame vseki student
        for (Student student:studentList) {
            //"{first name} {second name}: {grade}
            System.out.println(student);// obekta se preobrazuva v tekst s metoda toString
        }
    }
}




