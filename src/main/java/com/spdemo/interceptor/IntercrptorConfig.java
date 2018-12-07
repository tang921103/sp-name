package com.spdemo.interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Component
public class IntercrptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(myInterceptor()).addPathPatterns("/test").excludePathPatterns("/inter");
    }
    public MyInterceptor myInterceptor(){
       return new MyInterceptor();
    }
}
