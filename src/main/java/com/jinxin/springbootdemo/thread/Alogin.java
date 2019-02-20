package com.jinxin.springbootdemo.thread;

import com.jinxin.springbootdemo.controller.LoginController;
import com.jinxin.springbootdemo.utils.SpringBeanUtils;


/**
 * @author JinXin
 * @Date 2019/2/18 18:22
 */
public class Alogin implements Runnable {

    @Override
    public void run() {
        try {
            LoginController loginController = (LoginController) SpringBeanUtils.getBean("loginController");
            loginController.doPost("a","aa");
        } catch (InterruptedException e) {
        }
    }
}
