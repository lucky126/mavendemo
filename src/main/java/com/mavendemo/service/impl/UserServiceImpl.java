package com.mavendemo.service.impl;

import com.mavendemo.dao.UserMapper;
import com.mavendemo.model.User;
import com.mavendemo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lucky on 2017/3/17.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    public User getUserById(Integer userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}