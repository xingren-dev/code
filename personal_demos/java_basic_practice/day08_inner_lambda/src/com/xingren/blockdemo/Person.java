package com.xingren.blockdemo;

public class Person {
    public static String name;
    static {
        System.out.println("静态代码块_我是谁？");

        name="张三";
    }

    {
        System.out.println("实例代码块_我是谁?");
    }

    public Person(){
        System.out.println("构造方法_我是谁？");
    }
}
