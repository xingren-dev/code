package com.xingren.exam03;

public abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void drive();   // 第1处藏在和子类的关系里
}
