package com.zstao.provider.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.zstao.api.entity.User;
import com.zstao.api.mapper.UserDao;
import com.zstao.api.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0")
@Component
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> listSUsers(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userDao.listUsers();
    }

    /**
     * 查询用户具体信息
     * 包含用户信息，
     * 关注信息，发表文章信息
     * 喜欢类型
     * @param id
     * @return
     */
    @Override
    public User getSUser(int id) {


        return null;
    }


    @Override
    public int saveSUser(User user) {
        return userDao.savaUser(user);
    }

    @Override
    public int deleteSUser(Integer id) {
        return userDao.deleteUser(id);
    }

    @Override
    public int updateSUSer(User user) {
        return userDao.updateUser(user);
    }
}
