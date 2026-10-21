package com.xingren.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo05 {
    public static void main(String[] args) {
        System.out.println("程序开始");

        try {
            show();
            System.out.println("这次操作成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("这次操作失败了");
        }

        System.out.println("程序结束");

    }

    public static void show() throws Exception {
        String str="2026-07-09 11:12:13";

        //把字符串时间解析成Java中的一个日期对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);//编译时异常，提醒程序员这里的程序很容易出错，请注意
        System.out.println(date);

        InputStream is =new FileInputStream("D://a.txt");
    }
}
