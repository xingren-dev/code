package com.xingren.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合的遍历方式二：增强for循环
 */
public class CollectionDemo04 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("小明");
        names.add("小汪");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==============================");

        String[] users={"张三","李四","王五","小明","小明","小汪"};
        for (String name : users) {
            System.out.println(name);
        }


    }
}
