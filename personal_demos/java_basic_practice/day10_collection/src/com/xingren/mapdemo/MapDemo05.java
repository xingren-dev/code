package com.xingren.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Map集合的遍历方式
 */
public class MapDemo05 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put(null, null);
        System.out.println(map);

        map.forEach((k, v)
                -> System.out.println(k + "=" + v)
        );


    }
}
