package com.xingren.homework;

import java.util.Random;

public class HW02Generic {
    public static void main(String[] args) {
        String[] strings = new String[5];
        Integer[] integers = new Integer[5];
        Random r = new Random();

        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt(26);
        }

        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            strings[i] = r.nextInt(26) + "a";
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println();


        System.out.println(countEquals(strings, r.nextInt(26) + "a"));
        System.out.println(countEquals(strings, strings[2]));

        System.out.println(countEquals(integers, r.nextInt(26)));
        System.out.println(countEquals(integers, integers[2]));  // 至少命中1次，结果可预期


    }

    public static <T> int countEquals(T[] arr, T target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                count++;
            }
        }
        return count;
    }
}
