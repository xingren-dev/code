package com.xingren.method02;

public class ArrayTool {
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static int getArrayMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int getArrayMin(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int findIndex(int[] arr,int score){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==score){
                return i;
            }
        }
        //返回-1表示没有找到
        return  -1;


    }
}
