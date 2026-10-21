package com.xingren.oop02;

/**
 * 分析以下程序输出结果
 */
public class ArgsTest02 {
    public static void main(String[] args) {
        User u = new User();
        u.age=10;
        add(u);
        System.out.println("main-->" + u.age);//11

    }

    public static void add(User u){
        u.age++;
        System.out.println("add-->" + u.age);//11
    }
}

class User{
    int age;
}

