package com.xingren.polymorphic;

/**
 * 狼
 */
public class Wolf extends Animal {
    String name="狼";
    @Override
    public void run() {
        System.out.println("狼在跑");
    }
}
