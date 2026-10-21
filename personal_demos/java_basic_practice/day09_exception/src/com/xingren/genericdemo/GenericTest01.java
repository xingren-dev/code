package com.xingren.genericdemo;

import java.util.ArrayList;

public class GenericTest01 {
    public static void main(String[] args) {

        String[] s = new String[3];
        s[0] = "java";//
        String s1 = firstOne(s);
        System.out.println("第一个字符串：" + s1);

        Integer[] i = new Integer[3];
        Integer i1 = firstOne(i);
        System.out.println(i1);//null

        Integer[] i2 = new Integer[3];
        i2[0] = 100;
        Integer i3 = firstOne(i2);
        System.out.println("第一个整数：" + i3);


        MyBox<String> myBox = new MyBox<>();
        myBox.setContent("泛型真香");
        System.out.println("盒子里装的是:" + myBox.getContent());

        MyBox<Integer> myBox2 = new MyBox<>();
        myBox2.setContent(66);
        System.out.println("盒子里的数字是:" + myBox2.getContent());





    }

    public static <T> T firstOne(T[] arr) {
        if (arr.length == 0) {
            return null;
        }
        return arr[0];
    }


}
