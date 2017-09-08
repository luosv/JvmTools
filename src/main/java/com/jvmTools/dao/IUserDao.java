package com.jvmTools.dao;

import com.jvmTools.model.User;

/**
 * Created by luosv on 2017/9/8 0008.
 */
public interface IUserDao {

    User selectUser(long id);

}
