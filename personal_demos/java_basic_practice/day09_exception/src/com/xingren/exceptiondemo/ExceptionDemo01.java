package com.xingren.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo01 {
    public static void main(String[] args)  {

        //show();
        try {
            //监视代码，出现异常会被catch拦截住这个异常
            show2();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    //定义一个方法认识编译时异常
    public static void show2() throws ParseException, FileNotFoundException {
        String str="2026-07-09 11:12:13";

        //把字符串时间解析成Java中的一个日期对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);//编译时异常，提醒程序员这里的程序很容易出错，请注意
        System.out.println(date);

        InputStream is =new FileInputStream("D://a.txt");
    }

    //定义一个方法认识运行时异常
    public static void show() {

        int[] arr = {1,2,3};
        //System.out.println(arr[3]);

        //System.out.println(10 / 0);

        //空指针异常
        String str = null;
        //System.out.println(str.length());//NullPointerException
    }
}
