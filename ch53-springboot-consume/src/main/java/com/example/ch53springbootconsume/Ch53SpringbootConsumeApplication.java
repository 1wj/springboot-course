package com.example.ch53springbootconsume;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Ch53SpringbootConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch53SpringbootConsumeApplication.class, args);
    }

}
