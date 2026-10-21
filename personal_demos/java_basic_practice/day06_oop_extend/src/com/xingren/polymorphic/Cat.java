package com.xingren.polymorphic;

/**
 * 猫
 */
public class Cat extends Animal {
    String name="猫";
    @Override
    public void run(){
        System.out.println("猫在跑");
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
