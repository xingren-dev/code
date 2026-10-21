package com.xingren.innerclass02;

public class TestInner02 {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.show();

        System.out.println(new Outer().getAge());
    }
}
