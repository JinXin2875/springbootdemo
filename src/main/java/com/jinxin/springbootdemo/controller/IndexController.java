package com.jinxin.springbootdemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JinXin
 * @Date 2019/2/1 16:04
 */
@Controller
@RequestMapping("index")
public class IndexController {


    @RequestMapping("/html/test")
    public String test() {
       return "index";
    }

}
