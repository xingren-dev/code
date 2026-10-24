package com.xingren.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set家族集合的特点:无序，不重复，无索引
 * 1.HashSet:无序、不重复、无索引
 * 2. LinkedHashSet:有序，不重复、无索引
 * 3.TreeSet:排序、不重复、无索引
 */
public class SetDemo01 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("鸿蒙");
        set.add("鸿蒙");
        set.add("java");
        set.add("java");
        set.add("大数据");
        set.add("大数据");
        set.add("电商设计");
        set.add("电商设计");
        System.out.println(set);//[java, 鸿蒙, 电商设计, 大数据]

        Set<Double> set1 = new TreeSet<>();
        set1.add(3.14);
        set1.add(5.6);
        set1.add(7.8);
        set1.add(8.9);
        set1.add(9.0);
        System.out.println(set1);
    }
}
