package com.xingren.exam03;

public class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    public void drive() {
        System.out.println("自行车骑行");
    }


    public void ring() {
        System.out.println("铃响");
    }
}
