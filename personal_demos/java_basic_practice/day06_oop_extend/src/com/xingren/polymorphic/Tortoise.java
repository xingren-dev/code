package com.xingren.polymorphic;

/**
 * 乌龟
 */
public class Tortoise extends Animal {
    String name="乌龟";
    @Override
    public void run() {
        System.out.println("乌龟在跑");
    }
}
