package com.iotek.dao;

import java.util.List;


/**
 * Created by Administrator on 2017/12/17.
 */
public interface BaseDao<T> {

    boolean add(T t);

    boolean delete(T t);

    List<T> queryAll();

    T query(T t);

    boolean update(T t);


}
