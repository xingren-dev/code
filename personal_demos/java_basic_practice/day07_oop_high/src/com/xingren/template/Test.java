package com.xingren.template;

public class Test {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Student();
        persons[1] = new Teacher();

        for (int i = 0; i < persons.length; i++) {
            persons[i].write();
            System.out.println("================");
        }


    }
}
