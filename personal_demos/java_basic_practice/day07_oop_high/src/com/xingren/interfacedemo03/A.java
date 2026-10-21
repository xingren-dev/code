package com.xingren.interfacedemo03;

public interface A {
    //1. 默认方法（default method）：用default关键字修饰
    default void swim() {
        System.out.println("游泳");
        cry();
    }

    //2.私有方法（private method）：用private关键字修饰
    private void cry() {
        System.out.println("cry");
    }

    //3.静态方法（static method）：用static关键字修饰
    static void fly() {
        System.out.println("fly");
    }
}
