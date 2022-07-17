package com.example.ch35characterencoding2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.ch35characterencoding2.servlet")
public class Ch35CharacterEncoding2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch35CharacterEncoding2Application.class, args);
    }

}
