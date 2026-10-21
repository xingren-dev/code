package com.xingren.inherit;

public class Test {
    public static void main(String[] args) {
        /*
        子类可以继承父类的非私有成员
        子类对象其实是由子类和父类多张设计图共同创建出来的对象
         */
        //1.创建Teacher对象
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSex('男');
        t.setSkill("java");
        System.out.println(t.getName() + " " + t.getSex() + " " + t.getSkill());
    }
}
