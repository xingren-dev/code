package com.xingren.singleton;

public class LazySingleton {
    private LazySingleton(){}

    private static LazySingleton lazySingleton;

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
