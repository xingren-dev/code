package com.xingren.abstractdemo03;

/**
 * 抽象类的使用场景：模版方法设计模式
 *  1.提供一个方法作为完成某类功能的模板，模板方法封装了每个实现步骤，但允许子类提供特定步骤的实现
 *  2.模板方法设计模式可以：提高代码的复用、并简化子类设计
 *  3.写法：a、定义一个抽象类。
 *         b、在里面定义2个方法
 *           一个是模板方法：把共同的实现步骤放里面去。
 *           一个是抽象方法：不确定的实现步骤，交给具体的子类来完成。
 *  4.建议使用final关键字修饰模板方法
 *     模板方法是给子类直接使用的，不能被子类重写。
 *     一旦子类重写了模板方法，模板方法就失效了。
 */
public class Test {
    public static void main(String[] args) {

        Student s=new Student();
        s.write();

        System.out.println("====================");

        Teacher t=new Teacher();
        t.write();

    }
}
