package com.xingren.code;

/**
 * 实例代码块
 * 1.无static修饰，属于对象，每次创建对象时自动执行，执行次数与对象创建次数一致
 * 2.作用：初始化对象的实例资源
 */
public class CodeDemo02 {
    {
        System.out.println("实例代码块");
    }
    public static void main(String[] args) {

        new CodeDemo02();
        new CodeDemo02();
        System.out.println("main方法");
    }
}
