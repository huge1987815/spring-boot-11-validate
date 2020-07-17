package com.huge.springboot.service;

import com.huge.springboot.entity.Users;

import java.util.List;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-16 0:38
 */
public interface UserService {
    //查询所有用户信息
    List<Users> findAllUser();
    //添加用户
    int addUser(Users users);
}
