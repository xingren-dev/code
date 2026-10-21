package com.xingren.stringdemo;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {

        String s1 = "hello";
        System.out.println(s1);

        String s2 = new String();
        System.out.println(s2);//输出空字符串

        String s3 = new String("hello");
        System.out.println(s3);

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {97, 98, 65, 66, 67};
        String s5 = new String(bytes);
        System.out.println(s5);


        System.out.println("==================================");


        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);//true,同一个对象

        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);//false,不同对象

        System.out.println("==================================");


        String loginName = "admin";
        System.out.print("请输入用户名：");

        Scanner sc=new Scanner(System.in);
        String login = sc.nextLine();

        if(loginName.equals(login)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }


        System.out.println("==================================");

        System.out.print("请输入手机号:");
        String phone = sc.next();

        System.out.println("系统显示以下手机号进入");
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println(newPhone);


    }
}
