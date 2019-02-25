package com.jinxin.springbootdemo.statepattern.demoone;

/**
 * @author JinXin
 * @Date 2019/2/22 17:02
 */
public class User {

    OperateFunction operateFunction;

    public User() {
        this.operateFunction = new LogoutState();
    }

    public void commit() {
        operateFunction.commit();
    }
    public void forwoard() {
        operateFunction.forward();
    }
    public void setState(OperateFunction operateFunction) {
        this.operateFunction = operateFunction;
    }


}
