package com.xingren.exceptiondemo;

public class AgeIllegalException extends Exception{
    public AgeIllegalException(){}

    public AgeIllegalException(String message){
        super(message);
    }
}
