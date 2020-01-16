package com.zstao.api.mapper;

import com.zstao.api.entity.User;

import java.util.List;

/**
 * 用户的接口
 *
 * @author 赵胜涛
 */
public interface UserDao {

    // 查询所有的用户
    List<User> listUsers();

    //查询单个用户的相信信息
    User getUser(Integer id);

    //删除用户
    int deleteUser(int id);

    //增加用户
    int savaUser(User user);

    //修改用户信息
    int updateUser(User user);

    // 查询用户数量
    int userNumber();



}
