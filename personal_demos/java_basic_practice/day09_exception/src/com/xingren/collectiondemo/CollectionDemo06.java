package com.xingren.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 认识并发修改异常问题，搞清楚Collection三种遍历的区别
 */
public class CollectionDemo06 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");

        System.out.println(list);


        //删除全部带枸杞的元素
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.contains("枸杞")) {
                list.remove(s);
            }
        }
        System.out.println(list);//出现并发异常

        System.out.println("===============================");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        list2.add("西洋参");

        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
            if (s.contains("枸杞")) {
                list2.remove(s);
                i--;//删除数据后做一步 i-- 操作
            }
        }
        System.out.println(list2);

        System.out.println("===============================");

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("特级枸杞");
        list3.add("枸杞子");
        list3.add("西洋参");

        System.out.println(list3);

        for (int i = list3.size() - 1; i >= 0; i--) {
            String s = list3.get(i);
            if (s.contains("枸杞")) {
                list3.remove(s);
            }
        }

        System.out.println(list3);


        System.out.println("===============================");


        ArrayList<String> list4 = new ArrayList<>();

        list4.add("Java入门");
        list4.add("宁夏枸杞");
        list4.add("黑枸杞");
        list4.add("人字拖");
        list4.add("特级枸杞");
        list4.add("枸杞子");
        list4.add("西洋参");

        System.out.println(list4);

        //迭代器遍历并删除默认也存在并发修改异常问题
        Iterator<String> it = list4.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("枸杞")) {
                //list4.remove(s);//异常，并发修改异常
                it.remove();//用迭代器自己的方法删除
            }
        }
        System.out.println(list4);


        System.out.println("===============================");


        ArrayList<String> list5 = new ArrayList<>();

        list5.add("Java入门");
        list5.add("宁夏枸杞");
        list5.add("黑枸杞");
        list5.add("人字拖");
        list5.add("特级枸杞");
        list5.add("枸杞子");
        list5.add("西洋参");

        System.out.println(list5);

        //用增强for还有lambda都没有办法解决并发修改异常问题
        //增强for和lambda只适合做遍历，不适合做遍历并修改操作


    }
}
