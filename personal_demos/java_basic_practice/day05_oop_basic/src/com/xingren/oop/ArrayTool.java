package com.xingren.oop;

public class ArrayTool {
    public static void main(String[] args) {
        int[] arr={15,9000,10000,20000,9500,-5};

        printArr(arr);

        System.out.println("最大值是："+getMax(arr));



    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static  int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
