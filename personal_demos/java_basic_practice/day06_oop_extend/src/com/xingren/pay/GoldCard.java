package com.xingren.pay;
/*
 * 金卡类
 * 继承自Card类

 */
public class GoldCard extends Card{
    private double discount = 0.8;//金卡享受8折优惠

    public GoldCard() {
        super();
    }

    public GoldCard(double money, String phoneNumber, String ownerName, String carNumber) {
        super("金卡", money, phoneNumber, ownerName, carNumber);
    }

    @Override
    public void consume(double money) {
        System.out.println("你当前消费金额为" + money + "元" + "，因为您是" + this.getType()+ "用户，享受" + this.discount * 10 + "折优惠");
        money *= discount;
        System.out.println("优惠后的金额为：" + money + "元");
        if(money>getMoney()) {
            System.out.println("当前余额为" + getMoney() + "元，余额不足，请充值");
            return;
        }
        printWashTicket(money);
        super.consume(money);

    }

    public void printWashTicket(double money){
        if(money > 200){
            System.out.println("打印洗车票");
        }

    }
}
