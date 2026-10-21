package com.xingren.polymorphic;

/**
 * 多态的好处
 * 1.右边的对象是解耦合的，右边的对象可以随意变化，不会影响左边的对象
 * 2.父类类型的变量作为参数，可以接受任意一个子类对象
 *
 *
 * 多态不能调用子类的独有方法
 */
public class Test02 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.run();
        // a1.catchMouse();//报错，因为catchMouse方法在Animal类中不存在

        Animal a2 = new Wolf();
        go(a2);

        Animal a3 = new Tortoise();
        go(a3);

        System.out.println("=============================");

        Animal[] animals =new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Wolf();
        animals[2] = new Tortoise();
        for (int i = 0; i < animals.length; i++) {
            animals[i].run();
        }
        //animals[0].catchMouse(); //编译报错，因为catchMouse方法在Animal类中不存在
    }

    public static void go(Animal a) {
        a.run();
    }
}
