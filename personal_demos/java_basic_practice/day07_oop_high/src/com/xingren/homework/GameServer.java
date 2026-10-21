package com.xingren.homework;

public class GameServer {
    private GameServer(){}

    private static GameServer instance;
    public static GameServer getInstance(){
        if (instance == null){
            instance = new GameServer();
        }
        return instance;
    }
}
