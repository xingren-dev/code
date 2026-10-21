package com.xingren.polymorphic;

/**
 * 多态的类型转换
 *
 * 1.多态强转的注意事项
 *   ①存在继承/实现关系就可以在编译阶段进行强制类型转换，编译阶段不会报错。
 *   ②运行时，如果发现对象的真实类型与强转后的类型不同，就会报类型转换异常（ClassCastException）的错误出来
 * 强转前，需要进行 instanceof 判断，判断对象的真实类型与强转后的类型是否一致，一致才进行强转，否则会报错（ClassCastException）
 */
public class Test03 {
    public static void main(String[] args) {
        Animal a1 = new Cat();


        Cat c1 = (Cat) a1;
        c1.catchMouse();

        System.out.println("==================================");


        Animal a2 = new Wolf();
        Cat c2 = (Cat) a2;//运行时会报错ClassCastException


        Animal a3 = new Wolf();
        if (a3 instanceof Cat) {
            Cat c3 = (Cat) a3;
            c3.catchMouse();
        } else {
            System.out.println("a2 不是 Cat 类型，不能进行强转");
        }
    }
}
