package com.xingren.staticfield;

public class Student {
    //静态变量：有static修饰，属于类，只加载一份，可以被类和类的所有对象共享
    static String name;

    //实例变量：没有static修饰，属于对象，每个对象都有自己的实例变量
    int age;
}
