package com.xingren.abstractdemo01;

/**
 * 抽象类和抽象方法
 * 抽象类中不一定要有抽象方法，有抽象方法的类必须是抽象类，抽象类中可以有非抽象方法
 * 抽象类最主要的特点：抽象类不能创建对象，仅作为一种特殊的父类，让子类继承并实现
 * 抽象类的使命就是被继承
 *
 */
public class AbstractDemo01 {
    public static void main(String[] args) {
        B b=new B();
        b.cry();
    }

}
