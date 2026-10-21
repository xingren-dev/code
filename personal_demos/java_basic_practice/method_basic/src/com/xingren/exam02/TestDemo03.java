package com.xingren.exam02;

/**
 * 方法重载的三个要求：1.在同一个类中，2.方法名相同，3.形参列表不同（形参类型不同，形参个数不同，形参位置不同）
 */
public class TestDemo03 {
    public static void main(String[] args) {

    }

    public static int    f(int a)    {
        return 1;
    }

    //这一行会报错，因为它不满方法重载的三个要求，和 public static int    f(int a)在同一个类中，方法名相同，形参列表也相同，只有返回值类型不同
    //所以不是方法重载，这是方法重复，javac把它当成了重复的方法，说已经定义了方法 f(int)
    /*public static double f(int a)    {
        return 1.5;
    }   // 甲*/


    //这一行不会报错，因为它满足方法重载的三个要求，和 public static int    f(int a)在同一个类中，方法名相同，形参类型不同，
    public static double f(double a) {
        return 2.5;
    }   // 乙

    //编译器通过方法的实参的类型和个数决定调用哪个方法
    /*
    为什么返回值没有参与方法重载的判断
    因为编译器是通过实参的列表来决定调用哪个方法的，而返回值不是实参，所以返回值没有参与方法重载的判断
     */

}
