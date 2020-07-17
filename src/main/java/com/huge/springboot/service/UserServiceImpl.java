package com.huge.springboot.service;

import com.huge.springboot.dao.UserDao;
import com.huge.springboot.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-16 0:38
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<Users> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public int addUser(Users users) {
        return userDao.addUser(users);
    }
}
