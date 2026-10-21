package com.xingren.exam02;

public class TestDemo01 {
    public static void main(String[] args) {

        //test1();
        //test2();
        //test3();
        test4();

    }
    public static void test1() {
        int[] arr = {4, 9, 2, 7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("sum=" + sum);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void test2(){
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 999;
        a = new int[]{7, 8, 9};
        a[0] = 555;
        System.out.println(b[0]);
        System.out.println(a[0]);

    }

    public static void test3(){
        int[] scores = {-5, 12, 30, 8};
        int max = 0;
        for (int i = 0; i <= scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("max=" + max);

    }

    public static void test4(){

    }
}
