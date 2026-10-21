package com.xingren.singleton;

public class Test01 {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);
        System.out.println(hungrySingleton1 == hungrySingleton2);

        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
        System.out.println(lazySingleton1 == lazySingleton2);

    }
}
