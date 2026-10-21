package com.xingren.demo;

public class GoldCard extends Card {
    public GoldCard(String carNumber, String ownerName, String phoneNumber, double money) {
        super(carNumber, ownerName, phoneNumber, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("当前消费：" + money + "元");
        System.out.println("优惠后的金额为：" + (money * 0.8) + "元");
        if (getMoney() < money * 0.8) {
            System.out.println("当前余额" + getMoney() + "元，余额不足，请充值");
            return;
        }

        setMoney(getMoney() - money * 0.8);


        //如果消费金额大于200，打印洗车票
        if ((money * 0.8) > 200) {
            printWashTicket();
        } else {
            System.out.println("消费金额不满200元，不打印洗车票");
        }
    }


    public void printWashTicket() {
        if (getMoney() > 200) {
            System.out.println("打印洗车票");
        }
    }

}
