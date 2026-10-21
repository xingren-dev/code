package com.xingren.homework;

public interface USB {
    void work();   // 抽象方法
    default void charge() {          // default 方法，带方法体
        System.out.println("USB口充电");
    }
}

