package com.xingren.staticmethod;
//静态方法设计工具类
public class VerifyCodeUtil {

    //私有构造方法，防止实例化
    private VerifyCodeUtil(){}

    public static String generateVerifyCode(int length){
        String code = "";

        for (int i = 0; i < length; i++) {
            code += (int)(Math.random() * 10);
        }
        return code;
    }
}
