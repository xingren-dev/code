package com.xingren.override;

/**
 * 方法重写
 *
 */
public class Test01 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal {

    //方法重写：方法名称，形参列表必须完全一致
    //方法重写的规范：声明不变，重新实现
    @Override //方法重写的注解，表示子类的方法重写了父类的方法
    public void cry() { // 重写父类的方法
        System.out.println("猫叫");
    }
}


class Animal{
    public void cry(){
        System.out.println("动物叫");
    }

}
