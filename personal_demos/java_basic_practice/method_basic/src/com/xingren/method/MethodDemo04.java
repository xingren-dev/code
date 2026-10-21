package com.xingren.method;

/**
 * 当这个方法的修饰符有static关键字的时候，调用方法时：类名.方法名(实参);
 * 什么情况下，类名.可以省略
 *   调用者和被调用者在同一个类中，类名.可以省略
 */
public class MethodDemo04 {
    public static void main(String[] args) {
        //调用方法m1
        MethodDemo04.m1();

        //省略 类名.
        m1();

        //调用方法m2
        A.m2();

        //方法m2()不存在于MethodDemo04类中，在A类中不存在，所以不能调用
        //m2();

    }

    public static void m1() {
        System.out.println("m1方法执行了");
    }
}

class A{
    public static void m2() {
        System.out.println("m2方法执行了");
    }
}
