package com.jinxin.springbootdemo.controller;

import com.jinxin.springbootdemo.dataobject.UserDO;
import com.jinxin.springbootdemo.manager.user.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author JinXin
 * @Date 2019/3/15 14:18
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserManager userManager;

    @ResponseBody
    @RequestMapping("/test")
    public List<UserDO> userTest() {
        List<UserDO> users = userManager.getUsers();
        return users;
    }
}
