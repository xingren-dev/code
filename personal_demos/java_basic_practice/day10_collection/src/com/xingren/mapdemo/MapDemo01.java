package com.xingren.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 认识Map系列集合的特点
 */
public class MapDemo01 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put(null,null);
        System.out.println(map);

        Map<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("a",1);
        map2.put("b",2);
        map2.put("c",3);
        map2.put("d",4);
        map2.put("e",5);
        map2.put(null,null);
        System.out.println(map2);


    }
}
