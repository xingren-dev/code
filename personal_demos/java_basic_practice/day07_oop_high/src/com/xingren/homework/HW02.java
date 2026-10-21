package com.xingren.homework;

public class HW02 {
    public static void main(String[] args) {
        GameServer g1 = GameServer.getInstance();
        GameServer g2 = GameServer.getInstance();
        System.out.println(g1==g2);

        for (int i = 0; i < GameMode.values().length; i++) {
            game(GameMode.values()[i]);
        }



    }

    public static void game(GameMode gameMode){
        switch(gameMode){
            case RACE:
                System.out.println("开始进行竞速模式游戏");
                break;
            case PROP:
                System.out.println("开始进行道具模式游戏");
                break;
            case RANK:
                System.out.println("开始进行排名模式游戏");
                break;
            default:
                System.out.println("未知模式");
        }
    }
}
