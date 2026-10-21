package com.xingren.method;

/**
 * 方法的本质，方法的作用
 *  方法本质上就是一段可以被重复利用的代码片段
 *  并且每一个方法都是一个独立的封装好的功能
 *方法只定义，不调用，是不会执行的
 * 方法要执行的话，肯定是有一个位置调用了这个方法
 */
public class MethodDemo02 {
    //主方法，程序的入口
    public static void main(String[] args) {
        //调用add方法，完成两个数的求和

        //编写程序，计算100和200的和
        add(100, 200);//100 + 200 = 300

        //编写程序，计算666和888的和
        add(666, 888);//666 + 888 = 1554

        //编写程序，计算123和456的和
        add(123, 456);//123 + 456 = 579

    }

    //单独定义一个方法，实现一个功能，计算两个数的和
    //方法的定义：public static void add(int a,int b) { }
    public static void add(int a,int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
}
