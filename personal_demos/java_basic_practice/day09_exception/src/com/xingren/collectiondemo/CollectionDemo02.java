package com.xingren.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {

        Collection<String> list=new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        System.out.println(list);

        int size = list.size();//获取集合元素的个数
        System.out.println(size);

        boolean removed = list.remove("李四");//删除元素
        System.out.println(list);

        boolean empty = list.isEmpty();//判断集合是否为空
        System.out.println("list集合是否为空："+empty);

        list.clear();//清空集合
        System.out.println(list);

        boolean bo = list.contains("张三");//判断集合中是否存在某个元素，存在返回true,不存在返回false
        System.out.println("list集合中是否存在张三：”"+bo);

        list.add("张三");
        list.add("李四");
        list.add("王五");

        Object[] arr = list.toArray();//把集合转换成数组
        System.out.println(Arrays.toString(arr));


    }
}
