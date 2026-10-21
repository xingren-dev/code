package com.xingren.lambdademo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CompareDemo01 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        //往list中随机添加6个乱序数字
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(10);
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<>(list1);

        System.out.println("排序前");
        System.out.println(list1);

        System.out.println("=================================");

        System.out.println("排序后，匿名内部类版本");
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        System.out.println(list1);

        System.out.println("=================================");

        System.out.println("排序前");
        System.out.println(list2);

        System.out.println("=================================");


        System.out.println("排序后，Lambda表达式版本");

        list2.sort((i1, i2) -> (i2 - i1));
        System.out.println(list2);


    }


}
