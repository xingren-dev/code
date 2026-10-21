package com.xingren.method01reference;

public class Demo04 {
    public static void main(String[] args) {

/*        CarFactory cf = new CarFactory() {
            @Override
            public Car getCar(String name) {
                return new Car(name);
            }
        };*/

       /* CarFactory cf =  name -> new Car(name);*/


        CarFactory cf = Car::new;



        Car c1 = cf.getCar("宝马");

    }
}

@FunctionalInterface
interface CarFactory {
    Car getCar(String name);
}


class Car {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
