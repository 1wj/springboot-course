package com.example.ch34filter2.config;

import com.example.ch34filter2.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //定义此类为配置类
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){

        //注册过滤器
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean(new MyFilter2());

        //添加过滤路径
        filterRegistrationBean.addUrlPatterns("/user/*");

        return filterRegistrationBean;
    }
}
