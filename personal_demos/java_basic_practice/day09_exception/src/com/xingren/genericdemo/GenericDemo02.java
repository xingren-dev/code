package com.xingren.genericdemo;

import java.util.ArrayList;

/**
 * 自定义泛型类
 */

public class GenericDemo02 {
    public static void main(String[] args) {

        /*
        模拟ArrayList集合自定义一个集合MyArrayList
         */

        MyArrayList<String> myList =new MyArrayList<>();

        myList.add("java");
        myList.add("c++");
        myList.add("前端");

        System.out.println(myList);

        boolean removed = myList.remove("java");
        System.out.println(removed);

        System.out.println(myList);


    }
}
