package com.xingren.method01reference;

public class Student {

    private String name;// 姓名
    private int age;// 年龄
    private double height;// 身高
    private char sex;// 性别

    public Student() {
    }

    public Student(String name, int age, double height, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex=" + sex +
                '}';
    }

    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }


    public  int compareByHeight(Student s1, Student s2) {
        return Double.compare(s1.getHeight(), s2.getHeight());
    }

}
