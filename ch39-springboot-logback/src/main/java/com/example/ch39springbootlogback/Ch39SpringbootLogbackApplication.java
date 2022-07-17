package com.example.ch39springbootlogback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.ch39springbootlogback.mapper")
public class Ch39SpringbootLogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch39SpringbootLogbackApplication.class, args);
    }

}
