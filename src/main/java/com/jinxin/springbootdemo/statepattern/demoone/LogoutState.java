package com.jinxin.springbootdemo.statepattern.demoone;

/**
 * @author JinXin
 * @Date 2019/2/22 17:03
 * 登出状态
 */
public class LogoutState implements OperateFunction {
    @Override
    public void commit() {
        System.out.println("请登录");
    }

    @Override
    public void forward() {
        System.out.println("请登录");
    }
}
