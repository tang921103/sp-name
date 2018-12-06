package com.spdemo.controller;

import com.spdemo.conf.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {
    @Resource
    private Goods goods;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(goods);
        return "hello";
    }
}
