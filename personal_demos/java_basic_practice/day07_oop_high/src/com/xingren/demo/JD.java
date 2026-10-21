package com.xingren.demo;

public class JD implements Switch{
    private String name;
    private boolean status;//默认为关闭状态

    public JD(){}
    public JD(String name, boolean status){
        this.name = name;
        this.status = status;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "JD{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void press() {
        status = !status;//切换状态
    }
}
