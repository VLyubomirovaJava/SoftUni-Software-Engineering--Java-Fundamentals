package associativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> course = new LinkedHashMap<>();
        String command = scanner.nextLine();
//till we receive end as a command we will receive courses + students' names
        while (!"end".equals(command)) {
            String[] input = command.split(" : "); //"{courseName} : {studentName}".
            String courseName = input[0];
            String studentName = input[1];
//Check if such a course already exists and if not - add the course + add an empty list to it
// where we will add its students
            course.putIfAbsent(courseName, new ArrayList<>());
//Register the user into the course.
            List<String> students = course.get(courseName);
            students.add(studentName);
            //course.get(courseName).add(studentName);
            command = scanner.nextLine();
        }
//courseName -> List<String>
        course.entrySet()
                .forEach(entry -> {
                    //key: name of the course
                    //value : students
                    // name of the course -> count of students
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName ->
                            System.out.println("-- " + studentName));
                    //ascending order
                });
    }
}