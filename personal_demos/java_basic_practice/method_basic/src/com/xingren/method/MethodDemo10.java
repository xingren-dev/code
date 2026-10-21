package com.xingren.method;

/**
 * 当一个程序满足怎样的条件时，代码就构成了方法重载
 * 条件1：在同一类中
 * 条件2：方法名一致
 * 条件3：形参列表不同（参数类型不同，参数个数不同，参数顺序不同）
 *
 * 方法重载机制是编译阶段的机制，在编译阶段已经完成方法的绑定，在编译阶段已经确定了要调用哪个方法了
 *
 * 什么情况下考虑使用方法重载
 *   在以后的开发中，在一个类中，如果两个方法的功能相似，建议将方法名定义为同一个名字
 *   此时就使用了方法重载机制
 */
public class MethodDemo10 {
    public static void main(String[] args) {
    }

    //形参个数不同
    public static void m1() {
    }

    public static void m1(String s) {
    }

    //形参类型不同
    public static void m2(int a, int b) {
    }

    public static void m2(Long a, Long b) {
    }

    //形参顺序不同
    public static void m3(String s, int a) {
    }

    public static void m3(int a, String s) {
    }

    /*
     * 以下两个方法没有构成方法重载，属于方法重复定义，语法错误，编译器报错
     *     public static void doSome(int a,int b) {}
     *     public static void doSome(int x,int y) {}
     * }
     */
}
