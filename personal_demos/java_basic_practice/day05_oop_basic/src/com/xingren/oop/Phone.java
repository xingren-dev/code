package com.xingren.oop;

public class Phone {
    private String brand;
    private int price;
    private double weight;

    public Phone() {
    }

    public Phone(String brand, int price, double weight) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(int price) {
        if (price<0){
            System.out.println("价格不能为负数");
            return;
        }
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
}
