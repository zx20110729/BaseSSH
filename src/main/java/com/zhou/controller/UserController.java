package com.zhou.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zhou.entity.UserEntity;
import com.zhou.service.impl.UserService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by ZhouXiang on 2017/2/10 15:12.
 */
@Controller("userController")
public class UserController extends ActionSupport {
    @Autowired
    private UserService userService;

    private UserEntity user;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }


    public String regIndex() throws Exception{
        return SUCCESS;
    }
    public String reg() throws Exception {
        try {
            userService.addUser(user);
            ServletActionContext.getContext().getSession().put("user", user);
            ServletActionContext.getContext().getSession().put("msg", "恭喜,注册成功!");
            return SUCCESS;
        } catch (Exception e) {
            ServletActionContext.getContext().getSession().put("msg", "注册失败了!");
            return ERROR;
        }
    }
}
