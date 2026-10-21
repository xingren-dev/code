package com.xingren.pay;
/**
 * 银卡类
 * 继承自Card类
 */
public class SilverCard extends Card {
    private double discount = 0.9;//银卡享受9折优惠
    public SilverCard() {
        super();
    }
    public SilverCard(double money, String phoneNumber, String ownerName, String carNumber) {
        super("银卡", money, phoneNumber, ownerName, carNumber);
    }

    @Override
    public void consume(double money) {
        System.out.println("你当前消费金额为：" + money + "元" + "，您是" + this.getType()+ "，享受" + this.discount * 10 + "折优惠");
        money *= discount;
        System.out.println("优惠后的金额为：" + money + "元");
        super.consume(money);
    }
}
