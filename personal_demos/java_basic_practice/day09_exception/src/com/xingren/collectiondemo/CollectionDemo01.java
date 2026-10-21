package com.xingren.collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Collection集合
 *
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("java");
        list.add("C");
        list.add("C++");
        list.add("Python");

        System.out.println(list);//[java, C, C++, Python]  顺序和添加顺序一致

        String s = list.get(1);
        System.out.println(s);//C


        System.out.println("=============================");


        Set<String> set=new HashSet<>();


        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Java");
        set.add("Windows");
        set.add("Python");

        System.out.println(set);//[Java, C++, C, Windows, Python]   无重复元素，顺序和添加顺序不同



    }
}
