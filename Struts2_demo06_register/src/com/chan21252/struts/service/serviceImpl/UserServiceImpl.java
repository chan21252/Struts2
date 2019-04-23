package com.chan21252.struts.service.serviceImpl;

import com.chan21252.struts.dao.UserDao;
import com.chan21252.struts.dao.impl.UserDaoImpl;
import com.chan21252.struts.model.User;
import com.chan21252.struts.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void register(User user) {
        userDao.addUser(user);
    }
}
