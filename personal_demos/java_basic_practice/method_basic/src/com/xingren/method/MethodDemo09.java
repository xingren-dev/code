package com.xingren.method;

/**
 * 使用java语言中的方法重载机制，程序的优点
 *   在java语言中允许在一个类中定义多个方法，这些方法的名字可以一致
 *   优点1：代码美观
 *   优点2：方便调用，程序员需要记忆的方法名少了
 */

public class MethodDemo09 {
    public static void main(String[] args) {

        sum(10,20);
        sum (10L,20L);
        sum(3.0,2.0);

    }

    public static void sum(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public static void sum(long a,long b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public static void sum(double a,double b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
