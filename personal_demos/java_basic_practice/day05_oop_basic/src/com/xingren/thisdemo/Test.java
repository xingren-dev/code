package com.xingren.thisdemo;

/**
 * this关键字
 * 1. this是一个引用，指向当前对象
 * 2. this可以用来调用当前对象的成员变量
 * 3. this可以用来调用当前对象的成员方法
 * 4. this可以用来调用当前对象的构造方法
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);//com.xingren.thisdemo.Student@15db9742
        s1.print();//com.xingren.thisdemo.Student@15db9742
        s1.name="张三";
        s1.printName();//张三
    }
}
