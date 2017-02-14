package com.zhou.dao.impl;

import com.zhou.dao.IUserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by ZhouXiang on 2017/2/13 10:03.
 */
@Repository("userDao")
public class UserDao<T> implements IUserDao<T> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public Serializable save(T o) {
        return sessionFactory.getCurrentSession().save(o);
    }
}
