package com.xingren.abstractdemo03;

public abstract class Person {

    public final void write(){
        System.out.println("第一段");
        writeMain();
        System.out.println("第三段");
    }
    public abstract void writeMain();
}
