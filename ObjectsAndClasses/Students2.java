package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] arrStudentData = inputLine.split("\\s+");
            String firstName = arrStudentData[0];
            String lastName = arrStudentData[1];
            String age = arrStudentData[2];
            String town = arrStudentData[3];

            if (isExistingStudent(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName, age, town);
            } else {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            }
            inputLine = scanner.nextLine();
        }
        String filterCity = scanner.nextLine();
        students.stream()
                .filter(s ->
                        s.getTown().equals(filterCity))
                .forEach(s -> System.out.printf("%s %s is %s years old%n", s.firstName, s.lastName, s.age));
    }

    private static boolean isExistingStudent(List<Student> students, String FirstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(FirstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

   private static Student getStudent(List<Student> students, String firstName, String lastName, String age, String town) {

       Student existingStudent = null;
       for (Student student : students) {
           if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
               existingStudent = student;
               existingStudent.age = age;
               existingStudent.town = town;
           }
       }
       return existingStudent;
   }
   static class Student{
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

       public void setTown(String town) {
           this.town = town;
       }

       public String getFirstName() {
            return this.firstName;
        }

       public void setFirstName(String firstName) {
           this.firstName = firstName;
       }

       public String getLastName() {
            return this.lastName;
        }

       public void setLastName(String lastName) {
           this.lastName = lastName;
       }

       public String getAge() {
            return this.age;
        }

       public void setAge(String age) {
           this.age = age;
       }
   }


}




