package com.example.ch12mybatis.web;

import com.example.ch12mybatis.model.Student;
import com.example.ch12mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("student")
    public @ResponseBody Object student(Integer id){//一般转换成json格式会用到它
        Student student=studentService.queryStudentById(id);
        return student;
    }
}
