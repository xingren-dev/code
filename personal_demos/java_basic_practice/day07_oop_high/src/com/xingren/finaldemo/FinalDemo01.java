package com.xingren.finaldemo;

/**
 * final关键字
 * 1.final 修饰类，类不能被继承(工具类不需要被继承，可以用 final 修饰)
 * 2.final 修饰方法，方法不能被重写
 * 3.final 修饰变量，变量有且只能被赋值一次
 *            变量分为：局部变量，成员变量
 *            成员变量又分为：实例变量，静态变量
 *
 *4.final 修饰基本类型的变量，变量存储的数据不能被改变
 *  final 修饰引用类型的变量，变量存储的地址不能被改变，但地址所指向对象的内容是可以被改变的
 */
public class FinalDemo01 {

    // final 修饰静态变量，这个变量今后被称为常量，可以记住一个固定值，不能被修改，通常这个值作为系统的配置信息
    //常量的名称建议全部大写，多个单词之间用下划线连接
    public static final String SCHOOL_NAME = "清华大学";


    // final 修饰实例变量(一般没有意义)
    public final int age = 18;

    public static void main(String[] args) {

        final double pi = 3.14;
        //pi=3.14159;//报错，java: 无法为 final 变量 pi 分配值


        final int a=10;
        //a=20;//java: 无法为 final 变量 a 分配值

        final Student s = new Student();
        s.setAge(18);
        s.setName("张三");
        System.out.println(s);
        //s=new Student();//java: 无法为 final 变量 s 分配值




    }
}

final class A{}
//class B extends A{}//错误，java: 无法从最终com.xingren.finaldemo.A进行继承


class C{
    final void show(){
        System.out.println("C show");
    }
}

class D extends C{
    /*@Override
    void show(){//报错，java: show()在C中是最终方法，
        //java: com.xingren.finaldemo.D中的show()无法覆盖com.xingren.finaldemo.C中的show()

        System.out.println("D show");
    }*/
}

class Student{
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}



