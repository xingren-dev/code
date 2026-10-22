package com.xingren.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class HW03Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("爱你一万年");
        list.add("功夫熊猫");
        list.add("喜羊羊与灰太狼");
        list.add("熊出没");
        list.add("永不失联的爱");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("========================");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("========================");

        list.forEach(System.out::println);

        System.out.println("========================");

        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            String s = it1.next();
            if (s.contains("爱")) {
                it1.remove();
            }
        }
        System.out.println(list);

    }


}
