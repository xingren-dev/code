package com.xingren.genericdemo02;

public interface Data<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
    T query(Integer id);

}
