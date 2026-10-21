package com.xingren.innerclass01;

/**
 * 成员内部类
 *
 * 成员内部类访问外部类成员的特点
 * 1.成员内部类可以直接访问外部类的静态成员,也可以直接访问外部类的实例成员
 * 2.成员内部类的实例方法中，可以直接拿到外部类的对象，语法格式：外部类名.this
 *
 */
public class InnerClassDemo01 {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner(); // 创建内部类对象
        inner.show();

        System.out.println("=========================");

        new Person().new Heart().show();

    }
}

class Person{
    private int heartBeat=100;
    class Heart{
        private int heatBeat=80;
        public void show(){
           int hearBeat=200;
            System.out.println(hearBeat);//200
            System.out.println(this.heatBeat);//80
            System.out.println(Person.this.heartBeat);//100
        }

    }
}
