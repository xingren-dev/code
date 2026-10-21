package com.xingren.method;

import java.util.Scanner;

/**
 * 登录验证
 * 1.用户名是admin,密码是123，则登录成功
 * 2.用户名或者密码不对，请让用户继续登录，直到登录成功
 */
public class Login {
    public static void main(String[] args) {
        login();

    }
    public static boolean checkLogin(String username,String password){
        return "admin".equals(username) && "123".equals(password);
    }
    public static void login(){
        while (true) {
            System.out.print("请输入用户名：");
            String inputUsername = new Scanner(System.in).next();


            System.out.print("请输入密码：");
            String inputPassword = new Scanner(System.in).next();
            checkLogin(inputUsername,inputPassword);
            if (checkLogin(inputUsername,inputPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("用户名或者密码不对，请重新输入");
            }
        }
    }
}
