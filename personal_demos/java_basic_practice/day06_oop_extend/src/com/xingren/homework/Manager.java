package com.xingren.homework;
/*
经理类，继承员工类
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void manage(){
        System.out.println("在管理团队");
    }
}
