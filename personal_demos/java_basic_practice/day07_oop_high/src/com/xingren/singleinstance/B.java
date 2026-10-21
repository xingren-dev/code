package com.xingren.singleinstance;

/**
 * 饿汉式单例模式
 * 真正需要对象的时候才创建对象
 */
public class B {

    private B(){
    }

    private static B b;

    public static B getInstance(){
        if (b == null){
            b = new B();
        }
        return b;
    }
}
