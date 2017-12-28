package com.iotek.service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/17.
 */
public interface BaseService<T> {
    boolean add(T t);

    boolean delete(T t);

    List<T> queryAll();

    T query(T t);

    boolean update(T t);
}
