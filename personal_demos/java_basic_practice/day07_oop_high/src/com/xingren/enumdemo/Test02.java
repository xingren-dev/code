package com.xingren.enumdemo;

/**
 * 枚举类的应用场景
 * 1.做信息的分类和标志
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //模拟上下左右移动图片

        //常量做信息标志和分类，但参数值不受约束
        //   move(Constant.UP);

        //枚举类做信息标志和分类，参数值受约束
        move(Direction.UP);
        for (int i = 0; i < Direction.values().length; i++) {
            System.out.println(Direction.values()[i]);
        }


    }

/*    public static void move(int direction){
        switch (direction){
            case Constant.UP:
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
        }*/

    public static void move(Direction direction) {
        switch (direction) {
            case Direction.UP:
                System.out.println("向上移动");
                break;
            case Direction.DOWN:
                System.out.println("向下移动");
                break;
            case Direction.LEFT:
                System.out.println("向左移动");
                break;
            case Direction.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
        }

    }
}

