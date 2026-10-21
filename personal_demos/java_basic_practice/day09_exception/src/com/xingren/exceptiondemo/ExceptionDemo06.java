package com.xingren.exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo06 {
    public static void main(String[] args) {

        double price = 0;
        while (true) {
            try {
                price = userInputPrice();
                System.out.println("用户成功设置了商品定价："+price);
                break;
            } catch (Exception e) {
                System.out.println("用户输入的价格有误");
            }
        }


    }


    public static double userInputPrice() {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入商品定价");
        double price = sc.nextDouble();
        return price;


    }

}
