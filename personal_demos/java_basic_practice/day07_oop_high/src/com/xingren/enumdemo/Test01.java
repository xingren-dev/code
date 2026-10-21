package com.xingren.enumdemo;

/**
 *枚举类
 *1. 枚举都是最终类，不可以被继承，枚举类都是继承java.lang.Enum类的
 *2. 枚举类的第一行只能罗列一些名称，这些名称都是常量，并且每个常量会记住枚举类的一个对象
 *3. 枚举类的构造器都是私有的（写不写都只能是私有的），因此，枚举类对外不能创建对象
 *
 */
public class Test01 {
    public static void main(String[] args) {
        A a1 = A.X;
        System.out.println(a1);//X,重写了toString方法，因此输出X

        A a2 = A.Y;
        System.out.println(a2);//Y


        System.out.println(a1.name());//X,输出枚举对象的名称
        System.out.println(a1.ordinal());//0,输出枚举对象的索引

        System.out.println(a2.name());//Y,输出枚举对象的名称
        System.out.println(a2.ordinal());//1,输出枚举对象的索引


    }
}
