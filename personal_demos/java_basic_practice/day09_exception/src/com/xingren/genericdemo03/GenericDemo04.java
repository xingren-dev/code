package com.xingren.genericdemo03;

import com.xingren.genericdemo02.Student;

/**
 * 泛型方法
 */
public class GenericDemo04 {

    public static void main(String[] args) {

        //打印任意数组的内容

        Student[] stus=new Student[3];
        Student max = getMax(stus);


        String[] names={"zhangsan","lisi","wangwu"};
        String max1 = getMax(names);



    }

    public static <T> void printArray(T[] array) {

    }

    public static <T> T getMax(T[] array) {
        return null;
    }

}
