package com.huge.springboot.dao;

import com.huge.springboot.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-16 0:37
 */
@Mapper
public interface UserDao {
    //查询所有用户信息
    List<Users> findAllUser();
    //添加用户
    int addUser(Users users);
}
