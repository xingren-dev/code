package com.xingren.constructor;

/**
 * this()调用兄弟构造器
 */
public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student("播妞", '女', 18, "北大");
        System.out.println(s1);


        Student s2=new Student("赵敏", '女', 20);
        System.out.println(s2);

    }
}
