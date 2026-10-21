package com.xingren.method;

/**
 * 方法的返回值类型不是void的话，如果缺少返回语句，那么编译器会报错
 * 在同一个域中：return语句后面的代码是无法执行的，请不要写在return语句后面
 */
public class MethodDemo05 {
    public static void main(String[] args) {

    }

    //报错，缺少返回语句
    /* public static int m1() {
        int i=100;
        if(i>99){
            return i;
        }
    }*/

    //正确，有返回语句
    /* public static int m2() {
        int i=100;
        if(i>99){
            return i;
        }
        return 0;
    }*/

    public static int m3() {
        int i = 100;
        if (i > 99) {
            System.out.println(i);
            return i;
            //System.out.println("i>99");无法访问的语句
        }
        System.out.println(i);
        return 0;
        //System.out.println(i);无法访问的语句
    }

    public static int m4() {
        int i = 50;
        if (i > 99) {
            System.out.println(i);
            return i;
        }
        System.out.println(i);
        return 0;
    }
}
