package com.example.ch39springbootlogback.web;

import com.example.ch39springbootlogback.servicd.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/count")
    public @ResponseBody String studentCount(){
        log.info("查询当前学生总人数");
        log.trace("查询当前学生总人数");
        log.debug("查询当前学生总人数");
        log.warn("查询当前学生总人数");
        log.error("查询当前学生总人数");
        Integer studentCount =studentService.queryStudentCount();
        return "总人数："+studentCount;
    }

}
