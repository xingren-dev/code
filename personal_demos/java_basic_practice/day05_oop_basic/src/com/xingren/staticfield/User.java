package com.xingren.staticfield;

public class User {
    public static int count;
    public User(){
        //同一类中访问静态变量可以把类名省略
        count++;//统计创建多少个用户对象
    }
}
