package com.xingren.interfacedemo03;

/**
 * JDK 8之后，接口新增的三种方法
 *  1. 默认方法（default method）,使用接口的实现类来调用
 *  2. 静态方法（static method），使用接口名调用,接口的 static 方法连继承都不给实现类
 *  3. 私有方法（private method），使用接口的其他实例方法来调用
 */
public class Test {
    public static void main(String[] args) {

        B b=new B();
        b.swim();
        A.fly();
    }
}
class B implements A{

}
