package com.xingren.singleinstance;

/**
 * 饿汉式单例模式：在类加载的时候就创建对象
 */
public class A {
    //1.私有化构造方法，防止外部通过 new 创建对象
    private A() {
    }
    //2.创建一个静态变量，用于存储对象
    private static A instance = new A();

    //3.提供一个公共的访问方式
    public static A getInstance() {
        return instance;
    }
}
