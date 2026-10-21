package com.xingren.staticmethod;

public class Student {

    private double score;

    //静态方法：有static修饰，属于类
    public static void printHelloWorld(){

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    //实例方法：没有static修饰，属于对象
    public void printPass(){

        System.out.println(score>=60?"通过了":"未通过");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
