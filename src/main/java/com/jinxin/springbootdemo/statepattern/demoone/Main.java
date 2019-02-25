package com.jinxin.springbootdemo.statepattern.demoone;

/**
 * @author JinXin
 * @Date 2019/2/22 17:04
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.commit();
        user.forwoard();
        user.setState(new LoginState());
        user.commit();
        user.forwoard();
        //test
        //test02
    }
}
