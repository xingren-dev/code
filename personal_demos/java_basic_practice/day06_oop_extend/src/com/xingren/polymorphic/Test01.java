package com.xingren.polymorphic;

/**
 * 认识多态
 *
 * 方法：编译看左边，运行看右边
 * 成员变量：编译看左边，运行看左边（多态是对象、行为的多态，Java中的属性(成员变量)不谈多态）
 *
 * 多态的前提：有继承/实现关系；存在父类引用子类对象；存在方法重写
 *
 *
 */
public class Test01 {
    public static void main(String[] args) {
        //1.对象多态,行为多态
        Animal a1 = new Wolf();
        a1.run();// 狼在跑
        System.out.println(a1.name);//动物

        Animal a2 = new Tortoise();
        a2.run();// 乌龟在跑
        System.out.println(a2.name);//动物

        Animal a3 = new Cat();
        a3.run();// 猫在跑
        System.out.println(a3.name);//动物


    }
}
