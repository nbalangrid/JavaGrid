package com.java1.change;

public class MakingChanges {

    public static void changeIdentities(Person p1, Person p2) {

        String auxName;
        int auxAge;

        auxName=p1.name;
        auxAge=p1.age;

        p1.name=p2.name;
        p1.age=p2.age;

        p2.name=auxName;
        p2.age=auxAge;


    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name="Ion";
        p1.age=21;

        Person p2 = new Person();
        p2.name="Mircea";
        p2.age=32;

        System.out.println("Date initiale:");

        System.out.println("p1.name = "+p1.name);
        System.out.println("p1.age = "+p1.age);

        System.out.println("p2.name = "+p2.name);
        System.out.println("p2.age = "+p2.age);

        changeIdentities(p1,p2);

        System.out.println("Dupa schimbare:");

        System.out.println("p1.name = "+p1.name);
        System.out.println("p1.age = "+p1.age);

        System.out.println("p2.name = "+p2.name);
        System.out.println("p2.age = "+p2.age);

    }

}
