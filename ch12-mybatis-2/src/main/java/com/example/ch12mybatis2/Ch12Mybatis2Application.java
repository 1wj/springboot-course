package com.example.ch12mybatis2;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //开始spring配置 所有关于spring的配置都是从这开始的
@MapperScan(basePackages = "com.example.ch12mybatis2.mapper")//可以在这写开启扫描mapper接口的包以及子目录

public class Ch12Mybatis2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch12Mybatis2Application.class, args);
    }

}
