package com.xingren.exceptiondemo;

public class ExceptionTest01 {
    public static void main(String[] args) {

        try {
            checkAge(150);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        checkAge(25);

        try {
            checkAge2(150);
        } catch (AgeOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkAge2(25);
        } catch (AgeOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 120) {
            throw new AgeOutOfBoundsException("年龄越界" + age);
        }else{
            System.out.println("年龄合法");
        }

    }

    public static void checkAge2(int age) throws AgeOutOfBoundsException {
        if (age < 0 || age > 120) {
            throw new AgeOutOfBoundsException("年龄越界" + age);
        }else{
            System.out.println("年龄合法");
        }

    }
}
