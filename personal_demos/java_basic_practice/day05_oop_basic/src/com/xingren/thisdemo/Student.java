package com.xingren.thisdemo;

public class Student {

    /*
    this就是一个变量，可以用在方法中，来拿到当前对象的引用
    哪个对象调用这个方法，this就代表哪个对象
     */
    String name;
    public void print(){
        System.out.println(this);

    }
    public void printName(){
        System.out.println(this.name);
    }



}
