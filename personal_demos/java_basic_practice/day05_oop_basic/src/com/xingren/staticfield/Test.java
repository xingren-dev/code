package com.xingren.staticfield;

public class Test {
    public static void main(String[] args) {

        //1.类名.静态变量名
        Student.name="张三";
        System.out.println(Student.name);

        //2.实例变量
        Student s1 = new Student();
        s1.age=18;
        System.out.println(s1.age);

        //System.out.println(Student.age);//报错：java: 无法从静态上下文中引用非静态 变量 age
    }
}
