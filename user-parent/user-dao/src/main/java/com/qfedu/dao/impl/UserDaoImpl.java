package com.qfedu.dao.impl;

import com.qfedu.dao.User;
import com.qfedu.dao.UserDao;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() {
        User user = new User();
        return Arrays.asList(new User("xz", 23, "男"), new User("xzz", 23, "男"));

    }
}
