package com.xingren.interfacedemo05;

public class ClassDataInterImpl02 implements ClassDataInter {

    private Student[] students;
    public ClassDataInterImpl02(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentsInfo() {

        System.out.println("全班学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
        int countBoy=0;//统计男生人数
        int countGirl=0;//统计女生人数
        for (int i = 0; i < students.length; i++) {
            if (students[i].getSex().equals("男")) {
                countBoy++;
            } else {
                countGirl++;
            }
        }
        System.out.println("男生人数：" + countBoy + " 女生人数：" + countGirl);
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        double max = students[0].getScore();
        double min = students[0].getScore();
        for (int i = 1; i < students.length; i++) {
            if (students[i].getScore() > max) {
                max = students[i].getScore();
            }
            if (students[i].getScore() < min) {
                min = students[i].getScore();
            }
        }
        System.out.println("平均分：" + (sum - max - min) / (students.length - 2));

    }
}
