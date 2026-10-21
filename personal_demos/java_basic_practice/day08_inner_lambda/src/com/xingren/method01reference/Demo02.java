package com.xingren.method01reference;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {

        test01();

    }


    public static void test01(){
        Student[] students = new Student[6];

        students[0] = new Student("张三", 18, 175.2, '男');
        students[1] = new Student("李四", 19, 165.5, '女');
        students[2] = new Student("王五", 17, 170.3, '男');
        students[3] = new Student("赵六", 16, 168.7, '女');
        students[4] = new Student("孙七", 15, 182.1, '男');
        students[5] = new Student("周八", 14, 165.9, '女');

        System.out.println("排序前：");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("====================================");

        Student t = new Student();
        //按照身高升序排序
        System.out.println("排序后：");

        Arrays.sort(students, t::compareByHeight);



        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
