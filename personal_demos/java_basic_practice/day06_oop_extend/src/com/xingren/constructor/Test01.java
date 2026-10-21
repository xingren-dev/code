package com.xingren.constructor;

/**
 * 子类构造器的特点
 * 1.子类的构造器必须先调用父类的构造器，再执行自己的构造器
 */
public class Test01 {
    public static void main(String[] args) {

        Zi zi1 = new Zi();
        System.out.println("================");
        Zi zi2 = new Zi("张三");

    }
}

class Zi extends Fu{

    public Zi(){
        //默认会调用父类的无参构造器
        //super();
        System.out.println("子类的无参构造器");
    }

    public Zi(String name){
        super(name);//调用父类的有参构造器
        System.out.println("子类的有参构造器");
    }
}


class Fu{
    public Fu(){
        System.out.println("父类的无参构造器");
    }
    public Fu(String name){
        System.out.println("父类的有参构造器");
    }
}
