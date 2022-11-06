package OrderByAge;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person {
//poleta -> harakteristiki
    private String name;
    private String ID;
    private int age;
// konstruktor -> suzdavam obekti ot tozi klas
    public Person(String name, String ID, int age) {
        //v nachaloto e prazen obekt name =null, id = null, age = null
        // sreshtu poleto name, sloji promenlivata name
        this.name = name;
        this.ID = ID;
        this.age = age;
    }
//getter za da izpolzvame comparator
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        //            //Stephan with ID: 524244 is 10 years old.
        return String.format("%s with ID: %s is %d years old.",this.name,this.ID,this.age);
    }
}





