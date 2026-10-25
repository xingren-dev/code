package com.xingren.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的常用方法
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put(null,null);
        System.out.println(map);

        Integer i = map.get("a");
        System.out.println(i);//1

        boolean b = map.containsKey("b");
        System.out.println(b);//true

        boolean b1 = map.containsValue(3);
        System.out.println(b1);//true

        Integer d = map.remove("d");//根据键删除整个键值对，并返回值
        System.out.println(d);
        System.out.println(map);

        System.out.println(map.isEmpty());//集合是否为空
        System.out.println(map.size());//键值对的个数

        Set<String> keys = map.keySet();//获取所有键放到一个Set集合返回
        for (String key : keys) {
            System.out.println(key);
        }

        Collection<Integer> values = map.values();//获取所有值放到一个Collection集合中
        for (Integer value : values) {
            System.out.println(value);
        }

    }
}
