package com.xingren.encap;

public class Student {

    /*
      1.如何隐藏：使用private关键字修饰成员变量
         这样的话成员变量就只能在本类中被直接访问，其他任何地方不能直接访问
      2.如何暴露：使用public修饰的get和set方法合理暴露成员变量的取值和赋值

     */
    private String name;
    private int age;
    private double chineseScore;
    private double mathScore;

    public void setName(String name) {//为名字赋值
        this.name = name;
    }

    public String getName() {//获取名字的值
        return name;
    }

    public void setAge(int age) {//为年龄赋值
        this.age = age;
    }

    public int getAge() {//获取年龄的值
        return age;
    }

    public void setChineseScore(double chineseScore) {//为语文成绩赋值
        if (chineseScore >= 0 && chineseScore <= 100) {
            this.chineseScore = chineseScore;
        }
    }

    public double getChineseScore() {//获取语文成绩的值
        return chineseScore;
    }


    public void setMathScore(double mathScore) {//为数学成绩赋值
        if (mathScore >= 0 && mathScore <= 100) {
            this.mathScore = mathScore;
        }
    }

    public double getMathScore() {//获取数学成绩的值
        return mathScore;
    }


    public void printSumScore() {
        System.out.println(name + "的总分是：" + (chineseScore + mathScore));
    }

    public void printAverageScore() {
        System.out.println(name + "的平均分是：" + (chineseScore + mathScore) / 2);
    }
}
