package com.xingren.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Collection集合的遍历方式三：lambda表达式
 */
public class CollectionDemo05 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("小明");
        names.add("小汪");


        /* names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });*/


        /*names.forEach(name -> System.out.println(name));*/

        names.forEach(System.out::println);


}
}
