package com.zhou.controller;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

/**
 * 首页
 * Created by ZhouXiang on 2017/2/10 14:51.
 */
@Controller("indexController")
public class IndexController extends ActionSupport {
    private static Logger LOG = Logger.getLogger(IndexController.class);

    @Override
    public String execute() throws Exception {
        LOG.info("哈哈");
        return SUCCESS;
    }
}
