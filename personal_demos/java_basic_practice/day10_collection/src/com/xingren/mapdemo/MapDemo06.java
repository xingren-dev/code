package com.xingren.mapdemo;

import java.util.*;

public class MapDemo06 {
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {

        List<String> locations = new ArrayList<>();
        String[] names = {"玉龙雪山", "长城", "少林寺", "丽江"};
        Random r = new Random();
        for (int i = 1; i <= 80; i++) {
            locations.add(names[r.nextInt(names.length)]);
        }
        for (int i = 0; i < locations.size(); i++) {
            System.out.print(locations.get(i)+" ");
            if(i%5==4){
                System.out.println();
            }

        }

        Map<String, Integer> map = new HashMap<>();
        for (String location : locations) {
            if (!map.containsKey(location)) {
                map.put(location, 1);
            } else {
                map.put(location, map.get(location) + 1);
            }
        }
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
