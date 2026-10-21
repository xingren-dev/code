package com.xingren.javabean;

public class Student {
    private String name;
    private double chineseScore;
    private double mathScore;

    public Student(){}

    public Student(String name, double chineseScore, double mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Student{"+"name="+name+", chineseScore="+chineseScore+", mathScore="+mathScore+"}";
    }
}
