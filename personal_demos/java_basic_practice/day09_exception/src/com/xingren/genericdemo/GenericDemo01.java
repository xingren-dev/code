package com.xingren.genericdemo;

import java.util.ArrayList;

/**
 * 认识泛型
 *
 */
public class GenericDemo01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("c++");
        list.add("python");

        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i);
            System.out.println(s);


        }


    }
}
