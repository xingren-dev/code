package com.xingren.template;

public abstract class Person {
    public  void write(){
        System.out.println("第一段");
        writeMain();
        System.out.println("第三段");
    }

    public abstract void writeMain();
}
