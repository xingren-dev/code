package com.xingren.exam02;

public class ExamStudent {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "张三";
        s1.score = 95.5;
        s1.show();

        Student s2 = new Student("李四", 85.6);
        s2.show();

    }


}

class Student {
    String name;
    double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public  void show(){

        System.out.println(name+"的成绩是"+score);
    }




}
