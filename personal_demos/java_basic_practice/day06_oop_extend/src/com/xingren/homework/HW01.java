package com.xingren.homework;

public class HW01 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("张三", 5000);
        employees[1] = new Programmer("李四", 4000);
        employees[2] = new Manager("王五", 6000, 1000);

        for (int i = 0; i < employees.length; i++) {

            printEmp(employees[i]);
            if(employees[i] instanceof Manager m){
                m.manage();
            }

        }


    }

    public static void printEmp(Employee e){

        System.out.println(e.getName()+"："+e.getSalary());

    }
}
