package com.xingren.method02;

import java.util.Scanner;

public class ScoreStat {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88, 90, 100, 50, 100};

        ArrayTool.printArray(scores);

        int max = ArrayTool.getArrayMax(scores);
        System.out.println("最高分=" + max);

        int min = ArrayTool.getArrayMin(scores);
        System.out.println("最低分=" + min);

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查询的分数：");
        int score = sc.nextInt();
        int index = ArrayTool.findIndex(scores, score);
        System.out.println(score + "第一次出现的索引是" + index);


        int sum = getArraySum(scores);
        System.out.println("总分=" + sum);

        double average = getArrayAverage(scores);
        System.out.println("平均分=" + average);

        int count = countExcellent(scores);
        System.out.println("优秀人数为" + count + "个");
    }

    public static int getArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getArrayAverage(int[] array) {
        return (double) getArraySum(array) / array.length;
    }

    public static int countExcellent(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 90) {
                count++;
            }
        }
        return count;
    }
}
