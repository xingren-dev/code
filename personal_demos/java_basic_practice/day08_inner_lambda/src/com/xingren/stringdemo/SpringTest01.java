package com.xingren.stringdemo;

import java.util.Random;
import java.util.Scanner;

public class SpringTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入验证码的长度：");

        String code = getCode(sc.nextInt());

        System.out.println("生成的验证码是：" + code);
    }

    public static String getCode(int length) {
        //用一个字符串变量存储大小写字母和数字
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String code = "";

        Random r = new Random();

        for (int i = 0; i < length; i++) {

            code = code + str.charAt(r.nextInt(str.length()));

        }

        return code;
    }


}

