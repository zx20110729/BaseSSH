package com.zhou.service.impl;

import com.zhou.dao.IUserDao;
import com.zhou.entity.UserEntity;
import com.zhou.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZhouXiang on 2017/2/13 10:06.
 */
@Service("userService")
@Transactional
public class UserService implements IUserService{
    @Autowired
    private IUserDao<UserEntity> userDao;
    @Override
    public void addUser(UserEntity user) {
        userDao.save(user);
    }
}
