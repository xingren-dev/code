package com.xingren.staticmethod;

/**
 * 搞清楚静态方法的应用：可以做工具类
 * 登录
 * 做一个验证码程序
 */
public class Test2 {
    public static void main(String[] args) {

        String code = VerifyCodeUtil.generateVerifyCode(6);
        System.out.println(code);
    }
}
