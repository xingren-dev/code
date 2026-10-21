package com.xingren.innerclass03;

/**
 * 匿名内部类
 *
 * 匿名内部类实际上是有名字的
 *
 *
 */

public class Test01 {
    public static void main(String[] args) {

        Animal a=new Animal(){

            @Override
            public void cry(){
                System.out.println("小狗汪汪叫");
            }

        };

        a.cry();



    }
}
