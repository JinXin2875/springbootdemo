package com.jinxin.springbootdemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author JinXin
 * @Date 2019/2/1 16:04
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/html/test")
    public String test(@RequestBody String index) {
       return "index";
    }

    @ResponseBody
    @RequestMapping("/mysqlTest")
    public String mysqlTest() {
        String sql = "select * from usertest";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        System.out.println("123");
        return "";
    }

}
