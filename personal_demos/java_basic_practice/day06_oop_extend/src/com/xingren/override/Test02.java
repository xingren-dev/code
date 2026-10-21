package com.xingren.override;

/**
 * 方法重写的常见应用场景：子类重写Object类的toString()方法，以便返回对象的内容
 */
public class Test02 {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.setName("赵敏");
        s1.setAge(18);
        s1.setSex('女');
        System.out.println(s1.toString());
    }
}

class Student{
    private String name;
    private int age;
    private char sex;

    public Student() {}

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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
                ", sex=" + sex +
                '}';
    }
}
