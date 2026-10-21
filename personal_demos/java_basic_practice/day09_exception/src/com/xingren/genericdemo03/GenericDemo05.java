package com.xingren.genericdemo03;

import java.util.ArrayList;

/**
 * 通配符和上下限
 */

public class GenericDemo05 {

    public static void main(String[] args) {

        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);


    }

    public static void go(ArrayList<? extends Car> cars) {
    }
}
