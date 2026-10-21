package com.xingren.exceptiondemo;

public class ExceptionDemo02 {
    public static void main(String[] args) {

        try {
            System.out.println(div(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int div(int a, int b) throws Exception {

        if (b == 0) {
            System.out.println("除数不能为0");
            //返回一个异常给上层调用者
            throw new Exception("除数不能为0");
        }

        return a / b;


    }
}
