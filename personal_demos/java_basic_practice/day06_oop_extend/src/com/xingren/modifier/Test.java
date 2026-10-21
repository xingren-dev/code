package com.xingren.modifier;

/**
 * 权限修饰符：public > protected > 默认 > private
 */
public class Test {
    public static void main(String[] args) {

        Fu f = new Fu(); // 创建Fu类对象
        // f.privateMethod(); //报错，私有方法，不能在类外访问，java: privateMethod() 在 com.xingren.modifier.Fu 中是 private 访问控制
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
