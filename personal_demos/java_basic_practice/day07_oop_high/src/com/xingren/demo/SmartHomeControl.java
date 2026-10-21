package com.xingren.demo;

public class SmartHomeControl {
    public void control(JD jd){
        System.out.println("控制"+jd.getName()+"，当前状态："+jd.isStatus());
        jd.press();
    }
}
