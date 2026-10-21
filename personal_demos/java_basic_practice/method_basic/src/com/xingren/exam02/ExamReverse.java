package com.xingren.exam02;

public class ExamReverse {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
        reverse(arr1);

        System.out.println();

        int[] arr2={1,2,3,4,5,6};
        reverse(arr2);
    }

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {

            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;



        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
