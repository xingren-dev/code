package com.xingren.innerclass02;

public class Outer {
    private int age = 10;
    //静态内部类：属于外部类本身持有
    public static class Inner{
        public void show(){
            System.out.println("show Inner class");
            //System.out.println(age);//报错，java: 无法从静态上下文中引用非静态 变量 age
        }

    }

    public int getAge() {
        return age;
    }


}
