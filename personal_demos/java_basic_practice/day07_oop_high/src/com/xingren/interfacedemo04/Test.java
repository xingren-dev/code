package com.xingren.interfacedemo04;

/**
 * 接口的注意事项
 * 1、接口与接口可以多继承：一个接口可以同时继承多个接口[重点]。
 * 2、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承，也不支持多实现。
 * 4、一个类继承了父类，又同时实现了接口，如果父类中和接口中有同名的默认方法，实现类会优先用父类的。
 * 5、一个类实现了多个接口，如果多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
 */
public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.show();//Animal_show
    }
}


interface A1{
    default void show(){
        System.out.println("A1_show");
    }
}
class Animal{
    public void show(){
        System.out.println("Animal_show");
    }
}
class Dog extends Animal implements A1{

}






interface A{
    void A();
}

interface B{
    void B();
}

interface C extends A, B{
    void C();
}


