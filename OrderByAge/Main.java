package OrderByAge;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> personList =new ArrayList<>();
String input = scanner.nextLine();
while (!input.equals("End")){
    //input -> danni za daden chovek
    //input = "name ID age"
    String name=input.split("\\s+")[0];
    String ID =input.split("\\s+")[1];
            int age =Integer.parseInt(input.split("\\s+")[2]);
            //podavame tezi danni v nashiq obekt
       Person person =new Person(name,ID,age);
       //dobavqme go kum spisuk
       personList.add(person);

    input= scanner.nextLine();
}
//spisuk s hora
        //1. sortirame po vuzrast v narastvasht red
        personList.sort(Comparator.comparing(Person::getAge));
        //2. printirame gi
        for (Person person:personList) {
            //Stephan with ID: 524244 is 10 years old.
            System.out.println(person);
        }    }
}




