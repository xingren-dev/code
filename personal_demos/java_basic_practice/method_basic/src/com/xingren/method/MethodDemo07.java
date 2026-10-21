package com.xingren.method;

public class MethodDemo07 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};//a[0]=1,a[1]=2,a[2]=3,假设数组a存的地址是0x123
        change(a);
        System.out.println(a[0]);   // 实验1：预期999，实际：a[0]=999
        replace(a);
        System.out.println(a[0]);   // 实验2：预期还是1，实际a[0]=999
    }

    static void change(int[] arr) {//数组arr的地址是0x123
        arr[0] = 999;
        //arr[0]=999,修改的是a[0]的值，a[0]=999
    }

    static void replace(int[] arr) {//数组arr
        arr = new int[]{7, 7, 7};
        //arr存的地址是新的数组的地址0x456，arr[0]=arr[1]=arr[2]=7

    }
}



