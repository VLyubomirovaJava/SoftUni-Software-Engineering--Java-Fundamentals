package Students;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Student {
    //poleta - harakteristiki na studenta
private String name;
private String lastName;
private double grade;
// konsturktor - suzdavame obekti ot tozi klas
    public Student(String name, String lastName,Double grade){
        //nov obekt ot tozi klas
        this.name =name;
        this.lastName =lastName;
        this.grade =grade;
    }
    //getter

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",this.name,this.lastName,this.grade);

    }
}




