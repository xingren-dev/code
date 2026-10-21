package com.xingren.javabean;

public class StudentOperator {
    private Student s;

    public StudentOperator(){}
    public StudentOperator(Student s){
        this.s = s;
    }
    public void printSumScore(){
        System.out.println(s.getName() + "的总分是：" + (s.getChineseScore() + s.getMathScore()));
    }
    public void printAverageScore(){
        System.out.println(s.getName() + "的平均分是：" + (s.getChineseScore() + s.getMathScore()) / 2);
    }
}
