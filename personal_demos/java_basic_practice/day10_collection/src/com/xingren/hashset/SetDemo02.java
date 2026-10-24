package com.xingren.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合去重操作
 */
public class SetDemo02 {
    public static void main(String[] args) {

        Student s1 = new Student("张三",18,"北京","123456");
        Student s2 = new Student("李四",19,"上海","789451");
        Student s3 = new Student("张三",18,"北京","123456");
        Student s4 = new Student("李四",19,"上海","789451");

        Set<Student> set = new HashSet<Student>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
