package com.xingren.pay;

import java.util.Scanner;

/**
 * 测试类
 * 加油站支付小模块
 * 车主可以办理金卡或者银卡
 * 金卡消费8折，银卡消费9折，金卡消费满200元可以打印洗车票
 * 卡片信息包括：车牌号码，车主姓名，手机号，卡片余额，卡片类型
 */
public class Test {
    public static void main(String[] args) {

        Card c1=new GoldCard(10000, "12345678901", "张三", "京A12345");
        pay(c1);

        System.out.println("==================================");

        Card c2=new SilverCard(1000, "1235901", "王五", "苏A54321");
        pay(c2);

    }

    public static void pay(Card c){
        System.out.println("欢迎使用加油支付，您的卡片信息如下：");
        System.out.println("卡片类型：" + c.getType() + "，卡片余额：" + c.getMoney() + "元");

        System.out.print("请输入消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();// 接收用户输入的消费金额

        c.consume(money);

    }
}
