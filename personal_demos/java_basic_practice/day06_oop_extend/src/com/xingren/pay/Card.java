package com.xingren.pay;
/*
    卡类，所有卡片的父类，
    包含车牌号码（String carNumber），车主姓名（String ownerName）
        手机号（String phoneNumber），卡片余额（double money），卡的类型（String type）

 */
public class Card {
    private String carNumber;
    private String ownerName;
    private String phoneNumber;
    private double money;//卡片余额
    private String type;//卡的类型：金卡，银卡


    public Card() {
    }
    public Card(String type, double money, String phoneNumber, String ownerName, String carNumber) {
        this.type = type;
        this.money = money;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "carNumber='" + carNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", money=" + money +
                ", type='" + type + '\'' +
                '}';
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //存钱
    public void saveMoney(double money) {
        this.money += money;
        System.out.println("存钱成功，当前余额为：" + this.money);
    }

    //消费
    public void consume(double money) {
        if (money > this.money) {
            System.out.println("当前余额为：" + this.money + "元，余额不足，请充值");
        }else {
            this.money -= money;
            System.out.println("消费成功，当前余额为：" + this.money);
        }
    }
}
