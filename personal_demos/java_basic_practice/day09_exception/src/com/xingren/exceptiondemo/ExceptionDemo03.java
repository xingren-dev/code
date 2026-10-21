package com.xingren.exceptiondemo;

public class ExceptionDemo03 {
    public static void main(String[] args) {

        try {
            saveAge(100);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
    }

    //我们公司的系统只要收到了年龄小于1岁或者大于200岁的就是一个非法异常
    public static void saveAge(int age) throws AgeIllegalException {
        if (age < 1 || age > 200) {
            //年龄非法，抛出去一个非法异常
            throw new AgeIllegalException("年龄非法，年龄不能小于1岁或者大于200岁");
        }else{
            System.out.println("年龄合法");
            System.out.println("保存年龄："+age);
        }
    }
}
