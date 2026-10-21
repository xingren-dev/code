package com.xingren.interfacedemo;

public class Test {
    public static void main(String[] args) {
        A a=new A();
        a.swim();

        System.out.println("==================================");

        Swim[] swims=new Swim[2];
        swims[0]=new A();
        swims[1]=new B();
        for (int i = 0; i < swims.length; i++) {
            swim(swims[i]);
        }
    }

    public static void swim(Swim s){
        s.swim();
    }
}
