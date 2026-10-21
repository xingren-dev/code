package com.xingren.oop;
/*
   创建对象的格式：类名 对象名 = new 类名();
   例如：
       Student stu = new Student();
    */
public class TestStar {

    public static void main(String[] args) {
        Star s1 = new Star();

        s1.name = "王一博";
        s1.age = 18;
        s1.gender = "男";
        s1.weight = 75.5;
        s1.height = 180.0;

        System.out.println(s1.name);// 王一博
        System.out.println(s1.age);// 18
        System.out.println(s1.gender);// 男
        System.out.println(s1.weight);// 75.5
        System.out.println(s1.height);// 180.0


        Star s2 = new Star();

        s2.name = "杨幂";
        s2.age = 18;
        s2.gender = "女";
        s2.weight = 55.5;
        s2.height = 170.0;

        System.out.println(s2.name);// 杨幂
        System.out.println(s2.age);// 18
        System.out.println(s2.gender);// 女
        System.out.println(s2.weight);// 55.5
        System.out.println(s2.height);// 170.0

        Star s3 = new Star("wang", 18);
        System.out.println(s3.name);

    }



}
