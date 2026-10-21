package com.xingren.innerclass01;

public class Car {
    int speed = 120;

    class Engine {
        int rpm = 3000;

        public void show(){
            System.out.println(rpm);
            System.out.println(speed);
            System.out.println(Car.this);
        }
    }
}
