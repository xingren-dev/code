package com.xingren.oop;

public class Test {
    public static void main(String[] args) {
        Star s1 = new Star();
        s1.name = "张三";

        Star s2 = s1;        // 注意：这里没有 new
        s2.name = "李四";

        System.out.println(s1.name);
    }

}
