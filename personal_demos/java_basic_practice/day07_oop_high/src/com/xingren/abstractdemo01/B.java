package com.xingren.abstractdemo01;
//一个类继承了抽象类，那么这个类必须重写抽象类中的所有抽象方法,否则这个类必须是抽象类
public class B extends A {
    @Override
    public void cry() {
        System.out.println("B cry");
    }
}
