package com.xingren.innerclass02;

/**
 * 静态内部类
 * 1.静态内部类不能访问外部类的实例成员
 */
public class InnerClassDemo02 {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer.Inner();

        inner.show();
    }
}
