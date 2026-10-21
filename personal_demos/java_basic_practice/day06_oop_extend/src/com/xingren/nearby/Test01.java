package com.xingren.nearby;

/**
 * 继承的注意事项
 */
public class Test01 {
    public static void main(String[] args) {

    }
}

/*
  1.java的类只能是单继承的，即一个类只能继承自一个父类
  不支持多继承，即一个类不能继承自多个父类
  但支持多层继承，即一个类可以继承自一个父类，而这个父类又可以继承自其他父类
  2.一个类要么直接继承Object类，要么默认继承Object类，要么间接继承Object类
 */

class A{}

class B extends A{}

class C extends B{}
