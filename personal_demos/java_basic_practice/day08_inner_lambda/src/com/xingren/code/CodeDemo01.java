package com.xingren.code;

public class CodeDemo01 {
    // 静态代码块,有static修饰，属于类，与类一起优先加载，自动执行一次
    // 完成对类的静态资源的初始化
    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("main方法");
    }

}
