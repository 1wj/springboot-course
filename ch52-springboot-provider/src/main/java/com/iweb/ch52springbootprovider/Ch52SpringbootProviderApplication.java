package com.iweb.ch52springbootprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.iweb.ch52springbootprovider.mapper")
@EnableDubboConfiguration  //开启dubbo设置
public class Ch52SpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch52SpringbootProviderApplication.class, args);
    }

}
