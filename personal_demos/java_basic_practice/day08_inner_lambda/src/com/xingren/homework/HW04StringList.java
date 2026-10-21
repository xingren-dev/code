package com.xingren.homework;

import java.util.ArrayList;
import java.util.Random;

public class HW04StringList {
    public static void main(String[] args) {
        System.out.println(createCode(6));
        System.out.println(createCode(10));

        System.out.println("=================================");

        ArrayList<String> list=new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("c++");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String remove = list.remove(2);//删除索引为2的元素，返回被删除的元素

        int size = list.size();//获取集合中元素的个数
        System.out.println("集合中元素的个数是："+size);

        System.out.println(list);

    }


    public static String createCode(int n){
        //用一个字符串变量存储大小写字母和数字
        String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String code="";
        Random r = new Random();

        for (int i=0;i<n;i++){
            int index = r.nextInt(str.length());
            code+=str.charAt(index);
        }

        return code;
    }


}
