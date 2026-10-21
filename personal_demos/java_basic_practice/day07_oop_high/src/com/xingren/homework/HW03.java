package com.xingren.homework;

public class HW03 {
    public static void main(String[] args) {
        USB[] usbs = new USB[2];
        usbs[0] = new Mouse();
        usbs[1] = new Phone();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            usbs[i].charge();
            if (i < usbs.length - 1) {
                System.out.println("===============");
            }
        }

    }
}
