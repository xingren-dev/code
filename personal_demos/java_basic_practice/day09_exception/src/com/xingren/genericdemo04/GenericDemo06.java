package com.xingren.genericdemo04;

import com.xingren.genericdemo03.BYD;
import com.xingren.genericdemo03.Car;
import com.xingren.genericdemo03.Xiaomi;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * 泛型和集合不支持基本数据类型，只能支持对象类型(引用数据类型)
 */

public class GenericDemo06 {

    public static void main(String[] args) {

        //ArrayList<int> list=new ArrayList();//报错

        //泛型擦除：泛型工作在编译阶段，等编译后泛型就没用了，所以泛型再编译后都会被擦除，所有类型会恢复成Object类型


        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        System.out.println(i1 == i2);//true

        Integer i3 = 100;
        Integer i4 = 100;
        System.out.println(i3 == i4);

        int i = i3;
        System.out.println(i);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(130);
        list.add(120);

        int i6 = list.get(1);
        System.out.println(i6);

        System.out.println("=====================================");

        int i5 = 23;
        String s1 = Integer.toString(23);
        System.out.println(s1.getClass());

        Integer i7 = i5;
        String s2 = i7.toString();
        System.out.println(s2.getClass());

        System.out.println("=====================================");


        String s3 = "98";
        int i8 = Integer.parseInt(s3);
        System.out.println(i8 + 2);


    }

}
