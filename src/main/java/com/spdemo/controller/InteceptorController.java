package com.spdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InteceptorController {
    @RequestMapping("/inter")
    @ResponseBody
    public String interceptor(){
        return "hello interceptor";
    }
    @RequestMapping("/test")
    @ResponseBody
    public String interceptor1(){
        return "test";
    }
}
