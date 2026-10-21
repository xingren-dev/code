package com.xingren.interfacedemo01;

/**
 * 接口
 *  1.接口不能创建对象
 *  2.接口是用来被类实现（implements）的，实现接口的类称为实现类，一个类可以同时实现多个接口
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAME);

        C c = new C();
        c.cry();
        c.play();

    }
}

//C被称为实现类，实现了A，B两个接口
//实现类实现了多个接口，必须重写接口中的所有抽象方法，否则实现类必须是抽象类
class C implements A, B {
    @Override
    public void cry() {

        System.out.println("C cry");
    }

    @Override
    public void play() {

        System.out.println("C play");
    }
}
