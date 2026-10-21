package com.xingren.oop;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("华为");
        phone.setPrice(10000);
        phone.setWeight(0.5);
        System.out.println(phone.getBrand());
        System.out.println(phone.getPrice());
        System.out.println(phone.getWeight());

        Phone p2 = new Phone("小米", 1000, 0.5);
        p2.setPrice(-5);
        System.out.println(p2.getBrand());
        System.out.println(p2.getPrice());
        System.out.println(p2.getWeight());

    }
}
