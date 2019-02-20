package com.jinxin.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author JinXin
 * @Date 2019/2/18 18:19
 */
@Service("loginController")
public class LoginController {
    public static String usernameRef;
    public static String passwordRef;

    public void doPost(String username , String password) throws InterruptedException {
        usernameRef = username;
        if(password.equals("a")) {
            Thread.sleep(5000);
        }
        passwordRef = password;
        //System.out.println("username="+usernameRef+"password="+passwordRef);
        System.out.println("username= " + username + "password =" + password);
    }
}
