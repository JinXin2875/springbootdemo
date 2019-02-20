package com.jinxin.springbootdemo;

import com.jinxin.springbootdemo.controller.LoginController;
import com.jinxin.springbootdemo.thread.Alogin;
import com.jinxin.springbootdemo.thread.Blogin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Test
    public void contextLoads() throws InterruptedException {
        Thread aLogin = new Thread(new Alogin());
        Thread bLogin = new Thread(new Blogin());
        aLogin.start();
        bLogin.start();
    }

}

