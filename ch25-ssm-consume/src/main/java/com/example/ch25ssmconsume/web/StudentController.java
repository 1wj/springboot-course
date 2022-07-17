package com.example.ch25ssmconsume.web;



import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springboot.model.Student;

import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {

     @Reference(interfaceClass = StudentService.class,version = "2.0.0" )
    private StudentService studentService;

    @RequestMapping("/studetn/detail/{id}")
    public String stu(Model model, @PathVariable("id") Integer id){
        Student student=studentService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDeatil";

    }

    @RequestMapping("/studetn/all/count")
    public @ResponseBody Object all(){
      Integer count=studentService.queryAllStudentCount();
        return "学生总人数为："+count
                ;

    }

}
