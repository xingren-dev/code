package com.xingren.method;

/**
 * 在这个程序当中，我不会使用方法
 * 请分析，程序这样写，有什么问题，缺点是什么？
 *    代码复用性差，相同的代码写了一遍又一遍这种设计是不合理的
 *    提高代码复用性：方法(Method)
 */

public class MethodDemo01 {
    public static void main(String[] args) {

        //需求1：编写程序，计算100和200的和
        System.out.println("100+200=" + (100 + 200));//300

        //需求2：编写程序，计算666和888的和
        System.out.println("666+888=" + (666 + 888));//1554

        //需求3：编写程序，计算123和456的和
        System.out.println("123+456=" + (123 + 456));//579


    }
}
