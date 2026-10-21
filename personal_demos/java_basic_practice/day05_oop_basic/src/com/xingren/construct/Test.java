package com.xingren.construct;

/**
 * 构造器
 *
 */
public class Test {
    public static void main(String[] args) {

        Student s = new Student("播妞",18,"女");
        System.out.println("姓名："+s.name+"\n" +"年龄："+s.age+"\n" +"性别："+s.sex);
    }


}
