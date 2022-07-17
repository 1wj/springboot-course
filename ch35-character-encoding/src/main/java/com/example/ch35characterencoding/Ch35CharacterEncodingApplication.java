package com.example.ch35characterencoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.ch35characterencoding.servlet")
public class Ch35CharacterEncodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch35CharacterEncodingApplication.class, args);
    }

}
