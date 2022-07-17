package com.example.ch21springbootdubboprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //开启spring注解配置
@EnableDubboConfiguration  //开启dubbo注解配置
public class Ch21SpringbootDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch21SpringbootDubboProviderApplication.class, args);
    }

}
