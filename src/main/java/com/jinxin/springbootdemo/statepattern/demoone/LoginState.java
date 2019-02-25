package com.jinxin.springbootdemo.statepattern.demoone;

/**
 * @author JinXin
 * @Date 2019/2/22 17:03
 * 登录状态State
 */
public class LoginState implements OperateFunction {
    @Override
    public void commit() {
        System.out.println("评论");
    }

    @Override
    public void forward() {
        System.out.println("转发");
    }
}
