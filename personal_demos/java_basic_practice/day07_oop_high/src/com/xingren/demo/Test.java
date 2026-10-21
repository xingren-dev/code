package com.xingren.demo;

import java.util.Scanner;

/**
 * 面向对象实现智能家居控制系统
 * 设备（吊灯，电视，洗衣机，落地窗等等）
 * 功能：开和关
 * 由智能控制系统控制（单例对象）
 *
 */
public class Test {
    public static void main(String[] args) {
        JD[] jds = new JD[4];
        jds[0]=new TV("小米电视",true);
        jds[1]=new Air("海尔空调",true);
        jds[2]=new WashMachine("美的洗衣机",false);
        jds[3]=new Lamp("吊灯",true);

       /* SmartHomeControl smartHomeControl = new SmartHomeControl();
        for (int i = 0; i < jds.length; i++) {
            smartHomeControl.control(jds[i]);
        }*/

        //控制台界面
        System.out.println("欢迎来到智能家居控制系统");
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("0.退出系统");
            System.out.println("1.对设备进行开关操作");
            System.out.println("2.查看设备状态");

            System.out.print("请输入您的选择：");

           switch (sc.nextInt()){
               case 0:
                   System.out.println("系统已退出");
                   return;
               case 1:
                   System.out.println("现在有以下设备可以控制");
                   for (int i = 0; i < jds.length; i++) {
                       System.out.println((i+1)+". "+jds[i].getName()+",当前状态为"+jds[i].isStatus());
                   }
                   System.out.print("请输入您要控制的设备编号：");

                   int choice = sc.nextInt();
                   jds[choice-1].press();

                   for (int i = 0; i < jds.length; i++) {
                       System.out.println(jds[i].getName()+"，当前状态："+jds[i].isStatus());
                   }


                   break;
               case 2:
                   for (int i = 0; i < jds.length; i++) {
                       System.out.println(jds[i].getName()+"，当前状态："+jds[i].isStatus());
                   }
                   break;
               default:
                   System.out.println("输入错误，请重新输入");
           }

        }

    }
}
