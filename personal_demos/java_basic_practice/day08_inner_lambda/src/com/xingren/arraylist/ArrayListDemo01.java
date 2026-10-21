package com.xingren.arraylist;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //增
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("c#");
        list.add("李云龙");
        System.out.println(list);

        System.out.println("=================================");


        //查
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("=================================");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=================================");

        //删
        String remove = list.remove(0);//根据索引删除元素，返回被删除的元素
        System.out.println(list);

        System.out.println("=================================");

        boolean python = list.remove("python");//根据元素内容删除元素，返回是否删除成功
        System.out.println(list);

        System.out.println("=================================");
        //改
        String java = list.set(0, "java");// 根据索引修改元素，返回被修改的元素
        System.out.println(list);
    }
}
