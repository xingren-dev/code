package com.xingren.staticmethod;

public class Test {
    public static void main(String[] args) {
        Student.printHelloWorld();

        Student s1 = new Student();
        s1.setScore(59.5);
        s1.printPass();

        /*
        如果这个方法只是为了做一个功能且不需要直接访问对象的数据，这个方法直接定义成静态方法
        如果这个方法是对象的行为，需要访问对象的数据，这个方法必须定义成实例方法
         */
    }
}
