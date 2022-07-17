package com.example.ch25ssmconsume;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Ch25SsmConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch25SsmConsumeApplication.class, args);
    }

}
