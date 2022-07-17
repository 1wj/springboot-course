package com.example.ch15mybatis3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ch15mybatis3.mapper")
public class Ch15Mybatis3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch15Mybatis3Application.class, args);
    }

}
