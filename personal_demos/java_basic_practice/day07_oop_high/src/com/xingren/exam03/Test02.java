package com.xingren.exam03;

public class Test02 {
    public static void main(String[] args) {
        Vehicle v = new Bike("捷安特");   // 第2处
        Vehicle v2 = new Bike("无牌");  // 第3处
        if(v instanceof Bike b){
            b.ring();// 第4处
        }
    }
}
