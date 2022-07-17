package com.example.ch27java2.sersvice.impl;


import com.example.ch27java2.sersvice.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello(String msg) {
        return "sayhello"+msg;
    }
}
