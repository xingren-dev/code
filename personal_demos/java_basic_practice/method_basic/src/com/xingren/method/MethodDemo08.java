package com.xingren.method;

/**
 *  不用方法重载的缺点：
 *  1.代码不美观
 *  2.不方便调用，程序员需要记住更多的方法名
 */

public class MethodDemo08 {
    public static void main(String[] args) {

        sumInt(10,20);
        sumLong(10L,20L);
        sumDouble(3.0,2.0);

    }

    public static void sumInt(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public static void sumLong(long a,long b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public static void sumDouble(double a,double b  ){
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
