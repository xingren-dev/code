package com.xingren.exam03;

public class Circle extends Shape {

    private double r; // 半径

    public Circle(double r, String name) {
        super(name);
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14159 * r * r;
    }
}
