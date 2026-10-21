package com.xingren.demo;

public class SilverCard extends Card {
    public SilverCard(String carNumber, String ownerName, String phoneNumber, double money) {
        super(carNumber, ownerName, phoneNumber, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("当前消费：" + money + "元");
        System.out.println("优惠后的金额为：" + (money * 0.9) + "元");
        if (getMoney() < money * 0.9) {
            System.out.println("当前余额" + getMoney() + "元，余额不足，请充值");
            return;
        }
        setMoney(getMoney() - money * 0.9);

    }

}
