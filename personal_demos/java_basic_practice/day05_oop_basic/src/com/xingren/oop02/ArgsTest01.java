package com.xingren.oop02;

/*
面试题：判断程序的输出结果

 */
public class ArgsTest01 {
    public static void main(String[] args) {

        int i=10;
        //调用add方法的时候，把i传进去，把i变量的值10拷贝了一份，传给了add方法
        add(i);
        System.out.println("main-->" + i);//10
    }

    public static void add(int i) {
        i++;
        System.out.println("add-->" + i);//11
    }
}
