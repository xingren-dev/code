package com.xingren.streamdemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 认识Stream流
 */
public class StreamDemo02 {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        Map<String, Integer> map = new HashMap<>();
        Stream<String> s2 = map.keySet().stream();
        Stream<Integer> s3 = map.values().stream();
        Stream<Map.Entry<String, Integer>> s4 = map.entrySet().stream();

        String[] names = new String[5];
        Stream<String> s5 = Arrays.stream(names);
        System.out.println(s5.count());

        Stream<String> s6 = Stream.of(names);

    }
}
