package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    static class Student {
        //harakteristiki na studenta
        private String firstName;
        private String lastName;
        private String age;
        private String town;

        public Student(String firstName, String lastName, String age, String town) {
            //zadavame parametri, izvikvame argumentite za da oboslavqt harakteristikite
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] arrStudentData = inputLine.split("\\s+");
            String firstName = arrStudentData[0];
            String lastName = arrStudentData[1];
            String age = arrStudentData[2];
            String town = arrStudentData[3];
Student currentStudent =new Student(firstName,lastName,age,town);
studentList.add(currentStudent);

            inputLine = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();
        for (Student item:studentList) {
            if (item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %s years old%n",item.getFirstName(),item.getLastName(),item.getAge());            }
        }
    }
}




