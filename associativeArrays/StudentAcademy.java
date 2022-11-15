package associativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
// the map will consist of students names (strings) and Array of their grades
        Map<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            // taking name and grade from console until we reach the value of "n"
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            //if the student is not in our records, we add them + a list for their grades
            students.putIfAbsent(name, new ArrayList<>());
// we add the grade to the key
            students.get(name).add(grade);
        }
        // student name(key) -> (value) list of grades
        //creating map for the avg.grades of students
        Map<String, Double> avgGradeStudents = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            //entry:key student name -> value list of grades
            String studentName = entry.getKey(); // name of student
            List<Double> gradeList = entry.getValue(); // list of grades for each student
            double avgGrade = getAverageGrade(gradeList); // avg grade
            //student -> list of grades -> avg. score
            if (avgGrade >= 4.50) {
                avgGradeStudents.put(studentName, avgGrade);
            }
        }
        //we print avggradestudents list
        //entry: name(key) -> av.grade (value)
        avgGradeStudents.entrySet().forEach(entry ->
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
    private static double getAverageGrade(List<Double>listGrades) {
        //avg =sum of all grades/count grades
        double sumGrades = 0;
        for (double grade : listGrades) {
            sumGrades += grade;
        }
        //to find avg, deducting total to count of grades
        return sumGrades / listGrades.size();
    }
    }