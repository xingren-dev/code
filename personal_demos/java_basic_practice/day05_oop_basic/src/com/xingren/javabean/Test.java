package com.xingren.javabean;

public class Test {
    public static void main(String[] args) {
        //实体类的基本作用：创建它的对象，存取数据
        Student s1 = new Student();
        s1.setName("播妞");
        System.out.println(s1.getName());

        s1.setChineseScore(100);
        s1.setMathScore(90);
        System.out.println(s1.getChineseScore());
        System.out.println(s1.getMathScore());
        System.out.println(s1);

        Student s2 = new Student("播仔", 59, 80);
        System.out.println(s2.getName());
        System.out.println(s2.getChineseScore());
        System.out.println(s2.getMathScore());


        StudentOperator operator = new StudentOperator(s1);
        operator.printSumScore();
        operator.printAverageScore();

    }
}
