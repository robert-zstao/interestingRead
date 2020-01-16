package com.zstao.api.service;

import com.zstao.api.entity.User;

import java.util.List;

public interface UserService {

    List<User> listSUsers(int pageNum,int pageSize);

    User getSUser(int id);

    int saveSUser(User user);

    int deleteSUser(Integer id);

    int updateSUSer(User user);

}
