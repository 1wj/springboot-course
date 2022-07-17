package com.example.ch35characterencoding.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

@Configuration //配置文件
public class SystemConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){

        //创建字符编码过滤器
        CharacterEncodingFilter characterEncodingFilter=new CharacterEncodingFilter();
        //设置强制使用指定字符编码
        characterEncodingFilter.setForceEncoding(true);
        //设置指定字符编码
        characterEncodingFilter.setEncoding("utf-8");


        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        //设置字符编码过滤器
        filterFilterRegistrationBean.setFilter(characterEncodingFilter);
        //设置字符编码过滤器路径
        filterFilterRegistrationBean.addUrlPatterns("/*");
        return filterFilterRegistrationBean;
    }
}
