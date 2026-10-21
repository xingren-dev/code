package com.xingren.exam02;

public class TestDemo02 {
    public static void main(String[] args) {

        int n = 1;//把1这个值赋给了局部变量n
        int[] a = {1, 2, 3};//把数组{1, 2, 3}的地址赋给了引用变量a,假设地址是0x123
        change(n, a);//把n和a的值拷贝一份传递给形参x和arr，此时x=1,arr=0x123，调用change方法修改x的值为100，修改arr[0]=100
        System.out.println(n);      // 因为是复制的，所以x的改变，但n的值不会改变
        System.out.println(a[0]);   // 因为arr和a指向同一个数组，所以arr[0]=100，a[0]=100
    }

    //形参是一个整型和一个整数数组，这个方法的作用是把整数数组的第一个元素的值修改为100
    public static void change(int x, int[] arr) {
        x = 100;
        arr[0] = 100;
    }
}
