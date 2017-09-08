package com.jvmTools.service.impl;

import com.jvmTools.dao.IUserDao;
import com.jvmTools.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by luosv on 2017/9/8 0008.
 */
@Service("userService")
public class UserServiceImpl {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
