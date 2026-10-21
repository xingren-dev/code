package com.xingren.callback;

import java.util.ArrayList;
import java.util.List;

public class CallbackTest {
    public static void main(String[] args) {

        Student s1 = new Student("张三", 70);
        Student s2 = new Student("lisi", 80);
        Student s3 = new Student("wangwu", 90);
        Student s4 = new Student("zhangsan", 95);

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*使用匿名内部类，重写了函数式接口的方法,返回类型是布尔类型，return语句是判断是否符合条件
        是的话返回true,不是的话返回false
        main方法里new ScoreRule() {...}是匿名内部类，交给了ScoreRule rule
        count方法体的rule是ScoreRule类型的对象引用，重写方法的时候看return语句返回的是true，不是的话返回false
        count 里写 rule.accept(s)执行的是匿名内部类的方法

        count 里的 for (Student s : list) 是主动方：它持有数据，所以它负责遍历；
        但它不知道规则，所以每取一个学生就去问一次 rule。数据在 count 手里，判断能力在 rule 身上，
        两者都不越界——这就是「职责分离」在这个小方法里的样子。
        */
        int c1 = count(list, new ScoreRule() {
            @Override
            public boolean accept(Student s) {
                return s.getScore() >= 90;
            }
        });
        System.out.println("分数 >= 90：" + c1);

        int c2 = count(list, new ScoreRule() {
            @Override
            public boolean accept(Student s) {
                return s.getName().startsWith("张");
            }
        });
        System.out.println("名字是张开头：" + c2);


        int c3 = count(list, new ScoreRule() {
            @Override
            public boolean accept(Student s) {
                return s.getScore() >= 60 && s.getScore() <= 70;
            }
        });
        System.out.println("分数在60分到70区间：" + c3);


    }

    //ScoreRule换成了int minScore的话，int是整型，而姓张是字符串，所以不行
    public static int count(List<Student> list, ScoreRule rule) {

        int n = 0;

        for (Student s : list) {
            if (rule.accept(s)) {
                n++;
            }
        }

        return n;
    }
}
