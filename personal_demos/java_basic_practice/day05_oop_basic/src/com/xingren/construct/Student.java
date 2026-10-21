package com.xingren.construct;

public class Student {

    String name;
    int age;
    String sex;
    /*
    1.无参构造器
    是一种特殊方法，不能写返回值类型，方法名必须是类名，就是构造器
     */
    public Student(){

    }

    //2.有参构造器
    public Student(String name,int age,String sex){

        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
