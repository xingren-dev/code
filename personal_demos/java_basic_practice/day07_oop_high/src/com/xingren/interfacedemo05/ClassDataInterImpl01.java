package com.xingren.interfacedemo05;

public class ClassDataInterImpl01 implements ClassDataInter {

    private Student[] students;

    public ClassDataInterImpl01(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentsInfo() {

        System.out.println("全班学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("全班平均分是：" + sum / students.length);

    }
}
