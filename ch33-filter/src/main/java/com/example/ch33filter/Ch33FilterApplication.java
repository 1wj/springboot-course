package com.example.ch33filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.ch33filter.filter")
public class Ch33FilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch33FilterApplication.class, args);
    }

}
