package com.example.service.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    //dubbo:reference interface="" version=""
    @Reference(interfaceClass = StudentService.class ,version = "1.0.0")
    private StudentService studentService;

    @RequestMapping("/student/count")
    public Object stu(){
        Integer count=studentService.queryAllStudentCount();
        return "学生总人数："+count;
    }
}
