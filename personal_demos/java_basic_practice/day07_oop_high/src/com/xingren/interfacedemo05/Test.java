package com.xingren.interfacedemo05;

/**
 * 接口的小案例
 * 学生信息的管理模块
 * 学生的数据有姓名，性别和成绩
 * 功能1：打印全班学生的信息
 * 功能2：打印全班学生的平均成绩
 *
 * 有两套方案：
 * 方案一：打印班级全部学生的信息，打印班级全部学生的平均分
 * 方案二：打印班级全部学生的信息（含男女生人数），打印班级全部学生的平均分（要求去掉最高分和最低分）
 */
public class Test {
    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("张三", "男", 80);
        students[1] = new Student("李四", "女", 90);
        students[2] = new Student("王五", "男", 75);
        students[3] = new Student("赵六", "女", 85);
        students[4] = new Student("孙七", "男", 95);
        students[5] = new Student("周八", "女", 65);
        students[6] = new Student("吴九", "男", 55);
        students[7] = new Student("郑十", "女", 45);
        students[8] = new Student("王十一", "男", 35);
        students[9] = new Student("赵十二", "女", 25);


        ClassDataInter[] cdi=new ClassDataInter[2];
        cdi[0] = new ClassDataInterImpl01(students);
        cdi[1] = new ClassDataInterImpl02(students);
        for (int i = 0; i < cdi.length; i++) {
            System.out.println("方案"+(i+1));
            cdi[i].printAllStudentsInfo();
            cdi[i].printAverageScore();
            if(i<cdi.length-1){
                System.out.println("==========================");
            }
        }


    }
}
