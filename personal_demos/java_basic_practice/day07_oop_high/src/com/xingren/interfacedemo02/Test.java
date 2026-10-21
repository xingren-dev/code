package com.xingren.interfacedemo02;

/**
 * 接口的好处
 *  1.弥补了类单继承的不足，一个类同时可以实现多个接口，使类的角色更多，功能更强大。
 *  2.让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现（更利于程序的解耦合）。
 */
public class Test {
    public static void main(String[] args) {

        People p=new Student();
        Driver d1=new Student();
        Cookie c=new Student();

        Driver d2=new Teacher();

    }
}



interface Driver{}
interface Cookie{}

class People{

}

class Student extends People implements Driver, Cookie{

}

class Teacher  implements Driver, Cookie{

}
