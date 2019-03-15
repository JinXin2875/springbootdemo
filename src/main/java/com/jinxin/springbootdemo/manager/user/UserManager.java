package com.jinxin.springbootdemo.manager.user;

import com.jinxin.springbootdemo.dataobject.UserDO;

import java.util.List;

/**
 * @author JinXin
 * @Date 2019/3/15 14:17
 */
public interface UserManager {
    /**
     * 获取所有用户列表
     * @return
     */
    List<UserDO> getUsers();
}
