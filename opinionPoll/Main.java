package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person>personList= new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());//broi redove s personal info
        for (int row = 1; row <= n; row++) {
            //obhojdame vs redove s info
            String data = scanner.nextLine(); //"Desi 24"
            // ime vuzrast. split(" ") = masiv ime, masiv godini->
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);
            if (age > 30) {
                //sudavam zapis za choveka, suhranqvam person
                        Person person = new Person(name,age);
                        personList.add(person);
            }
        }
        for (Person person:personList) {
            // otpechatvane ime - vuzrast
            //getname shte poluchi stoinostta ot getter-a v classa
            System.out.println(person.getName()+" - "+person.getAge());
        }
    }
}




