package com.example.ch30interceptor.config;

import com.example.ch30interceptor.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  //定义此类为配置文件的注解（相当于之前的xml配置文件）
public class InterceptorConfig implements WebMvcConfigurer {



    //mvc：interceptors
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addPathPatterns={
            "/user/**"
        };
        String[] excludePathPatterns={
                "/user/out","/user/error","/user/login"
        };
        //mvc:interceptor bean class=""
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
