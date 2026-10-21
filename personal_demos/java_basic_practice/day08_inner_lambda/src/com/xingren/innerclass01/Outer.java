package com.xingren.innerclass01;

public class Outer {

    public static String name = "Outer";
    int age = 10;

    // 成员内部类,无static修饰，是外部类对象持有的
    class Inner {

        public void show() {
            System.out.println(name);
            System.out.println("show");
            System.out.println(age);
            System.out.println(Outer.this);
        }
    }

}
