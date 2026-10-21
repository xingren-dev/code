package com.xingren.nearby;

/**
 * 就近原则
 */
public class Test02 {
    public static void main(String[] args) {

        Zi zi = new Zi();
        zi.show();
    }

}

class Fu{
    String name="Fu_name";

}
class Zi extends Fu{
    String name="Zi_name";
    void show(){
        String name="show_name";
        System.out.println(name);//show_name
        System.out.println(this.name);//Zi_name
        System.out.println(super.name);//Fu_name
    }
}

