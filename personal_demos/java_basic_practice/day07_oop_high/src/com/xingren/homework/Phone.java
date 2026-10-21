package com.xingren.homework;

public class Phone implements USB{
    @Override
    public void work() {
        System.out.println("手机传输数据");
    }

    @Override
    public void charge() {
        System.out.println("手机快充");
    }


}
