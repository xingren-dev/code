package com.xingren.demo;

import java.util.Scanner;

/**
 * 加油站支付小模块
 * 1.创建卡片类（Card），包括金卡（GoldCard）、银卡（SilverCard）
 * 卡片信息包括车牌号码（String carNumber）、车主姓名（String ownerName）
 *            电话号码（String phoneNumber）、卡片余额（double balance）
 * 2.金卡办理时存入金额必须大于等于5000元，银卡办理时存入金额必须大于等于2000元，金卡支付时享受8折优惠，银卡支付时享受9折优惠
 * 金卡消费满200元可以提供免费洗车服务
 *
 *
 */
public class Test {
    public static void main(String[] args) {

        GoldCard goldCard = new GoldCard("京A12345", "张三", "12345678901", 10000);
        pay(goldCard);

        SilverCard silverCard = new SilverCard("苏A12345", "王五", "12345677901", 1000);
        pay(silverCard);


    }

    public static void pay(Card c) {
        System.out.print("请刷卡，请输入消费金额:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);

        System.out.println("支付完成，剩余余额为：" + c.getMoney() + "元");

    }


}
