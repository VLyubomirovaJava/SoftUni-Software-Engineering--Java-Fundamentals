package opinionPoll;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person {
    // poleta -> harakteristiki
    private String name;
    private int age;

    //konstruktor - za da suzdadem obekti ot klasa, nosi sushtoto ime na klasa
    public Person(String name, int age) {
        //nov obekt, iskam sreshtu poleto name da stroi stoinostta ot konstruktors
        this.name = name;
        this.age = age;  //na tozi nov obekt, vzemame stoinostta ot dadenoto v classa
    }
//getter - dostypvame stoinostta na poleto name , age i tn

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
    //metodi - povedenie, kakvo moje da pravi tozi chovek v sluchaq
//tuk toi ne pravi neshto specifichno





