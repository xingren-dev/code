package com.xingren.method;

public class OverloadDemo {
    public static void main(String[] args) {

        sum(10, 20);//30
        sum(10, 20, 30);//60
        sum(10.0, 20.0);//30.0
    }

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public static void sum(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + d);
    }

    public static void sum(double a, double b) {
        double e = a + b;
        System.out.println(a + " + " + b + " = " + e);
    }

   /* 报错：java: 已在类 com.xingren.method.OverloadDemo中定义了方法 test(int)
       方法重载要求：在同一类中，方法名相同，形参列表不同
       但下面两个方法，在同一个类中，方法名相同，形参列表相同，只有返回值类型不同，不构成方法重载

   public static int test(int a) {

          return a;

    }

    public static double test(int a) {

        return (double) a;
    }*/
}
