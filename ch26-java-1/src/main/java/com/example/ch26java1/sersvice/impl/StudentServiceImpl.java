package com.example.ch26java1.sersvice.impl;

import com.example.ch26java1.sersvice.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "sayhello";
    }
}
