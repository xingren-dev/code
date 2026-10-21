package com.xingren.homework;

/*
 *程序员类，继承员工类
 */
public class Programmer extends Employee {

    public Programmer(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double getSalary() {
        return super.getBaseSalary() * 1.1;
    }
}
