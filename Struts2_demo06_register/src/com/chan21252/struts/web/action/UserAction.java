package com.chan21252.struts.web.action;

import com.chan21252.struts.model.User;
import com.chan21252.struts.service.UserService;
import com.chan21252.struts.service.serviceImpl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    public String register(){
        System.out.println(user);

        UserService us = new UserServiceImpl();
        us.register(user);
        return NONE;
    }

    @Override
    public User getModel() {
        return user;
    }
}
