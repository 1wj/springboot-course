package com.example.ch01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//springboot项目启动入口类
@SpringBootApplication  //springboot核心注解，主要用于开启 spring自动配置
public class Ch01Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch01Application.class, args);
    }

}
