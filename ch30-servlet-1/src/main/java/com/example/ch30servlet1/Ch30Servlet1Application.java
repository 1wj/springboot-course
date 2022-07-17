package com.example.ch30servlet1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication  //开启spring配置
@ServletComponentScan(basePackages = "com.example.ch30servlet1.servlet")
public class Ch30Servlet1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch30Servlet1Application.class, args);
    }

}
