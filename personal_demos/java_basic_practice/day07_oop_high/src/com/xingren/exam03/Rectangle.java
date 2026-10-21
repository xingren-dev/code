package com.xingren.exam03;

public class Rectangle extends Shape {
    private double h;
    private double w;

    public Rectangle(double h, double w, String name) {
        super(name);
        this.h = h;
        this.w = w;
    }


    @Override
    public double area() {
        return w * h;
    }
}
