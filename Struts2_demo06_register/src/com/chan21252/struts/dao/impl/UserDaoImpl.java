package com.chan21252.struts.dao.impl;

import com.chan21252.struts.dao.UserDao;
import com.chan21252.struts.model.User;
import com.chan21252.struts.utils.JDBCUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());

    @Override
    public int addUser(User user) {
        String sql = "INSERT INTO tb_user (username, password, birthday, hobby, married) VALUES (?, ?, ?, ?, ?)";
        try{
            return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getBirthday(), user.getHobby(), user.isMarried());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findUser(User user) {
        return null;
    }
}
