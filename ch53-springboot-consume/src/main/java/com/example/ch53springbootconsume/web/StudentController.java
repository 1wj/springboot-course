package com.example.ch53springbootconsume.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.iweb.ch51springbootinterface.service.StudentService;
import com.iweb.ch51springbootinterface.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0")
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public String stu(Model model, @PathVariable("id") Integer id){
        Student student=studentService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDetail";
    }
}
