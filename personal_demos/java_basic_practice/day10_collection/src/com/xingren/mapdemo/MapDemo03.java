package com.xingren.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历方式
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put(null, null);
        System.out.println(map);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }
}
