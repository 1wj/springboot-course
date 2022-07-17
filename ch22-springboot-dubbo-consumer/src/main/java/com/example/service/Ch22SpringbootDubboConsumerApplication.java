package com.example.service;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //开启spring注解配置
@EnableDubboConfiguration //开启dubbo配置
public class Ch22SpringbootDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch22SpringbootDubboConsumerApplication.class, args);
    }

}
