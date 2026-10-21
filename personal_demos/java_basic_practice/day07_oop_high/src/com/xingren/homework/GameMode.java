package com.xingren.homework;


public enum GameMode {

    RACE("竞速模式","比谁快"),

    PROP("道具模式","使用道具互相干扰"),

    RANK("排名模式","上分提升段位");


    private final String name;
    private String description;

    GameMode(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }



    public String getDescription() {
        return description;
    }



    public String getInfo(){
        return name+":"+description;
    }
}
