package com.xingren.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExamTest {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student("张三", 18, "北京", "123456");
        Student s2 = new Student("李四", 19, "上海", "789451");
        Student s3 = new Student("张三", 18, "北京", "123456");
        Student s4 = new Student("李四", 19, "上海", "789451");
        Student s5 = new Student("赵六", 20, "天津", "857412");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println(students);


    }
}
