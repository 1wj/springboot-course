package com.example.ch24ssmprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.ch24ssmprovider.mapper")
@EnableDubboConfiguration

public class Ch24SsmProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch24SsmProviderApplication.class, args);
    }

}
