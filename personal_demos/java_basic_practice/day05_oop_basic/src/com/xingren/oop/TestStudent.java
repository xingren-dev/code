package com.xingren.oop;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name="播妞";
        s1.chineseScore=100;
        s1.mathScore=100;

        Student s2 = new Student();

        s2.name="播仔";
        s2.chineseScore=39;
        s2.mathScore=100;

        double sum=s1.chineseScore + s1.mathScore + s2.chineseScore + s2.mathScore;

        System.out.println("总成绩是"+sum);
        System.out.println("平均成绩是"+sum/4);



    }
}
