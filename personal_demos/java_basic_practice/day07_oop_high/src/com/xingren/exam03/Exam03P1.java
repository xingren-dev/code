package com.xingren.exam03;

public class Exam03P1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.5, "圆形");
        shapes[1] = new Rectangle(1.5, 2.0, "长方形01");
        shapes[2] = new Rectangle(1.0, 3, "长方形02");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getName() + ":" + shapes[i].area());
        }
        int count = Shape.count;
        System.out.println(count);
    }
}
