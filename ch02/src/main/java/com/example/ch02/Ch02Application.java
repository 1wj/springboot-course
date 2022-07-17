package com.example.ch02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.ch02.web")  //扫描mapper接口 或者在配置类中加也行
public class Ch02Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch02Application.class, args);
    }

}
