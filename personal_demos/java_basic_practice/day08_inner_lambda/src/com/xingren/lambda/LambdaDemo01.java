package com.xingren.lambda;

/**
 * Lambda并不是可以简化全部的匿名内部类，Lambda只能简化函数式接口的匿名内部类
 * <p>
 * 函数式接口：有且仅有一个抽象方法的接口
 */
public class LambdaDemo01 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("小狗汪汪叫");
            }
        };
        a.cry();


        System.out.println("========================================");

        Swim s = new Swim() {
            @Override
            public void Swimming() {
                System.out.println("小鱼游游游");
            }
        };
        s.Swimming();


        System.out.println("========================================");


        Swim s1 = () -> {
            System.out.println("小鱼游游游");
        };
        s1.Swimming();


    }
}

abstract class Animal {
    public abstract void cry();
}

@FunctionalInterface//声明函数式接口的注解
interface Swim {
    void Swimming();
}
