package com.xingren.method;

/**
 * 1.方法只定义，不调用是不会分配内存空间的
 * 2.方法调用的瞬间,会在JVM的栈内存中分配活动场所，此时发生压栈动作
 * 3.方法一旦结束，给该方法分配的内存空间就会被释放，此时发生弹栈动作
 */
public class MethodDemo06 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");

    }

    public static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    public static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");

    }

    public static void m3() {
        System.out.println("m3 begin");
        System.out.println("m3 over");

    }
}
/*
输出结果：
main begin
m1 begin
m2 begin
m3 begin
m3 over
m2 over
m1 over
main over
 */
