package com.xingren.hashset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合对于自定义对象的排序
 * TreeSet集合默认不能给自定义对象排序，因为不知道大小规则
 * 解决方案一：自定义对象类实现一个Comparable比较接口，重写compare方法，指定大小比较规则
 * 解决方案二：public TreeSet(Comparator c)集合自带比较器Comparator对象，指定比较规则
 */
public class SetDemo03 {
    public static void main(String[] args) {
        TreeSet<Teacher> teachers = new TreeSet<>(Comparator.comparingDouble(Teacher::getSalary));

        teachers.add(new Teacher("老陈",20,6232.4));
        teachers.add(new Teacher("dilei",18,3999.5));
        teachers.add(new Teacher("老王",22,9999.9));
        teachers.add(new Teacher("老李",20,1999.0));

        System.out.println(teachers);



    }
}
