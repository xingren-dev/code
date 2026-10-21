package com.xingren.methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class MethodRefDemo01 {
    public static void main(String[] args) {



        PersonCreator pc = name -> new Person(name);

        System.out.println(pc.create("lisi").getName());

        PersonCreator pc2=Person::new;
        System.out.println(pc2.create("张三").getName());
        System.out.println("===============================");

        List<String> words=new ArrayList<String>();

        words.add("hello");
        words.add("apple");
        words.add("banana");

        words.forEach(s-> System.out.println(s));
        System.out.println("===============================");

        words.forEach(System.out::println);
        System.out.println("===============================");

        IntParser intParser = Integer::parseInt;
        System.out.println((intParser.parse("123")+10));


    }
}
