package com.example.ch32servlet2.config;

import com.example.ch32servlet2.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

//servlet配置类
@Configuration  //该注解将此类定义为配置类（相当于一个xml配置文件）
public class ServletConfig {
    //@Bean是一个方法级别上的注解，主要用在配置类里
    //相当于一个
    //<beans>
    //  <bean id="" class=""></bean>
    //
    // </beans>
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean<>(new MyServlet(),"/myservlet");
        return servletRegistrationBean;

    }

}

