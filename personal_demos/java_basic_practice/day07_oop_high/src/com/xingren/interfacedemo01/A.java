package com.xingren.interfacedemo01;

/**
 * 接口是使用interface关键字定义的
 */
public interface A {
    //JDK 8之前，接口只能定义常量和抽象方法
    //1.常量：接口中定义常量可以省略public static final，编译器会自动加上
    String SCHOOL_NAME = "清华大学"; // public static final String SCHOOL_NAME = "清华大学";

    //2.抽象方法：接口中的抽象方法可以省略public abstract，编译器会自动加上
    void cry(); // public abstract void cry();



}
