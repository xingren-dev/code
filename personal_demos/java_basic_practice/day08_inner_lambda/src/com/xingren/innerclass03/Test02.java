package com.xingren.innerclass03;

/**
 * 匿名内部类的使用形式
 */
public class Test02 {
    /**
     *  学生，老师都要参加游泳比赛
     *
     */
    public static void main(String[] args) {

        Swim swim1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生正在游泳");
            }
        };
        start(swim1);


        System.out.println("========================");

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生正在游泳");
            }
        });

        System.out.println("========================");


        Swim swim2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师正在游泳");
            }
        };

        start(swim2);

        System.out.println("========================");


        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师正在游泳");
            }
        });


    }


    public static void start(Swim swim) {
        System.out.println("开始游泳比赛");
        swim.swimming();
        System.out.println("游泳比赛结束");
    }


}






interface Swim {
    void swimming();
}
