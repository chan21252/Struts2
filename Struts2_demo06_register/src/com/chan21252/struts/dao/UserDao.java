package com.chan21252.struts.dao;

import com.chan21252.struts.model.User;

public interface UserDao {
    public int addUser(User user);
    public User findUser(User user);
}
