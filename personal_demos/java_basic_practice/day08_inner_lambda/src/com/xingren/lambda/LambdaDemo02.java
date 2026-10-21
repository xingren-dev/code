package com.xingren.lambda;

import com.xingren.innerclass03.Student;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo02 {
    public static void main(String[] args) {
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


        //按照年龄升序排序
        System.out.println("排序后：");
/*        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        });*/

/*        Arrays.sort(students, (Student s1, Student s2) -> {
                    return s1.getAge() - s2.getAge();
                }
        );*/

        Arrays.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
