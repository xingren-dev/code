package com.xingren.homework;

public class HW01Balance {
    public static void main(String[] args) {
        //withdraw(1000, 2000);//BalanceNotEnoughException: 余额不足，还差1000.0元

        try {
            withdraw(1000, 2000);
        } catch (BalanceNotEnoughException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(double balance ,double amount){
        if (balance < amount) {
            throw new BalanceNotEnoughException("余额不足，还差" + (amount - balance)+"元");
        }else{
            System.out.println("余额充足");
        }
    }

}
