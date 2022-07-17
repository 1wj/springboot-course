package com.example.ch19redis.controller;

import com.example.ch19redis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/put")
    public Object put(String key,String value){
        studentService.put(key,value);
        return "值已经成功放入redis11";
    }


}
