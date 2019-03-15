package com.jinxin.springbootdemo.manager.user.impl;

import com.jinxin.springbootdemo.dataobject.UserDO;
import com.jinxin.springbootdemo.manager.user.UserManager;
import com.jinxin.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JinXin
 * @Date 2019/3/15 14:17
 */
@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDO> getUsers() {
        return userMapper.getUsers();
    }
}
