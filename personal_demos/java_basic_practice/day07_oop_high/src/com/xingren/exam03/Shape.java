package com.xingren.exam03;

/**
 * 抽象类Shape
 */
public abstract class Shape {

    static int count=0;

    private String name;//图形的名字

    public Shape(){
        count++;//统计创建出了多少个图形
    }

    public Shape(String name){
        this.name=name;
        count++;//统计创建出了多少个图形
    }


    public String getName() {
        return name;
    }

    public abstract double area();//抽象方法，计算面积
}
