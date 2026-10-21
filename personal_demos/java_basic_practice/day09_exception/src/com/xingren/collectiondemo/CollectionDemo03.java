package com.xingren.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合的遍历方式一：迭代器遍历
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("小明");
        names.add("小汪");

        System.out.println(names);

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();

    }
}
