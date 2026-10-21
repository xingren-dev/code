package com.xingren.innerclass01;

public class TestInner01 {
    public static void main(String[] args) {

        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.show();

        System.out.println("=========================");

        Car.Engine engine2 = new Car().new Engine();
        engine2.show();
    }
}
