package com.xingren.homework;

public class HW01Calc {
    public static void main(String[] args) {

        Calc calc = new Calc() {
            @Override
            public int calc(int a, int b) {
                return a > b ? a : b;
            }
        };

        System.out.println("a和b中大的那个数是"+(calc.calc(10, 20)));

        Calc calc2 = (a, b) -> a + b;

        System.out.println("a和b的和为"+calc2.calc(10, 20));


    }


}
