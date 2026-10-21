package com.xingren.callback;

//函数式接口，参数类型是Student
public interface ScoreRule {
    boolean accept(Student s);
}
