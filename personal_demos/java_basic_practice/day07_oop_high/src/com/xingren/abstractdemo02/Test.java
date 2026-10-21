package com.xingren.abstractdemo02;

/**
 * 使用抽象类的好处
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry(); // 输出：狗叫

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

    }
}
