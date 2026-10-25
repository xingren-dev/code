package com.xingren.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历方式
 */
public class MapDemo04 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put(null, null);
        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }




    }
}
