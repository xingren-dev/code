package com.xingren.exam02;

public class ExamAverage {
    public static void main(String[] args) {
        //定义一个数组scores1
        int[] scores1={80, 90, 75, 95, 85};
        //调用getAverage方法计算scores1的平均值
        double ave1 = getAverage(scores1);
        //输出scores1的平均值
        System.out.println("scores1的平均值为: " + ave1);

        //定义一个数组scores2
        int[] scores2={80, 90, 75, 95, 84};
        //调用getAverage方法计算scores2的平均值
        double ave2 = getAverage(scores2);
        //输出scores2的平均值
        System.out.println("scores2的平均值为: " + ave2);


    }

    //计算数组所有元素的总和
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    //计算数组所有元素的平均值
    public static double getAverage(int[] arr){
        return (double)getSum(arr)/arr.length;
    }
}
