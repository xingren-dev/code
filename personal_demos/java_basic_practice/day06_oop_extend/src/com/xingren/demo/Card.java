package com.xingren.demo;

public abstract class Card {
    private String carNumber;//车牌号码
    private String ownerName;//车主姓名
    private String phoneNumber;//电话号码
    private double money;//卡片余额

    public Card() {
    }
    public Card(String carNumber, String ownerName, String phoneNumber, double money) {
        this.carNumber = carNumber;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
        this.money = money;
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

    @Override
    public String toString() {
        return "Card{" +
                "carNumber='" + carNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", balance=" + money +
                '}';
    }

    //预存金额
    public void recharge(double money) {
       this.money += money;
    }

    //消费金额
    public void consume(double money) {
        this.money -= money;
    }


}
