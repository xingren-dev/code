package com.xingren.homework;

public class BalanceNotEnoughException extends RuntimeException{
    public BalanceNotEnoughException(){}
    public BalanceNotEnoughException(String message){
        super(message);
    }
}
