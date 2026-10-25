package com.xingren.streamdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");

        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);

        List<Double> scores = new ArrayList<>();

        scores.add(99.6);
        scores.add(77.6);
        scores.add(98.7);
        scores.add(86.5);
        scores.add(94.5);
        scores.add(94.5);

        scores.stream().sorted().forEach(System.out::println);
        System.out.println("============================");
        scores.stream().sorted((o1, o2) -> Double.compare(o2, o1)).limit(2).forEach(System.out::println);//只要2两个
        System.out.println("============================");
        scores.stream().sorted((o1, o2) -> Double.compare(o2, o1)).skip(2).forEach(System.out::println);//跳过前2个
        System.out.println("============================");
        scores.stream().sorted((o1, o2) -> Double.compare(o2, o1)).distinct().forEach(System.out::println);//去重

        //加工方法
        scores.stream().map(s -> "加10分后:" + (s + 10)).forEach(System.out::println);

        //合并流
        Stream<String> s1= Stream.of("张三丰","张无忌","张学友","刘谦");
        Stream<Integer> s2=Stream.of(1,2,3,4);
        Stream<Object> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);

    }
}
