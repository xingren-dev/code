package com.xingren.method01reference;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        //英文名字
        String[] names={"Tom","Jerry","Mike","Spike","john","Lucy", "emma","Alice","Bob"};

        System.out.println("排序前：");
        System.out.println(Arrays.toString(names));

        System.out.println("=============================");

        System.out.println("排序后：");
        //忽略首字母的大小进行升序排序
        //Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        //特定方法引用，等价于上一行代码
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));


    }
}
