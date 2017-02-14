package com.zhou.dao;

import java.io.Serializable;

/**
 * Created by ZhouXiang on 2017/2/13 10:02.
 */
public interface IUserDao<T> {
    public Serializable save(T o);
}
