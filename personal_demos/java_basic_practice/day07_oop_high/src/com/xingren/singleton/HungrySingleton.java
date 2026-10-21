package com.xingren.singleton;

/**
 * 饿汉式单例
 */
public class HungrySingleton {

    private HungrySingleton() {
    }

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
