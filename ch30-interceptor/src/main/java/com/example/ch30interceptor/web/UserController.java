package com.example.ch30interceptor.web;


import com.example.ch30interceptor.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    //登录
    @RequestMapping("/login")
    public @ResponseBody Object login(HttpServletRequest request){
        Student student=new Student();
        student.setAge(18);
        student.setName("zhangsan");
        student.setId(1001);
        request.getSession().setAttribute("user",student);

        return  "login success";
    }

    //登录之后才可以访问的
    @RequestMapping("/center")
    public @ResponseBody Object center(){
        return  "see center message";
    }

    //不登录之后也可以访问的
    @RequestMapping("/out")
    public @ResponseBody Object out(){
        return  "out see anytime";
    }

    //如果用户访问了需要登录才能看见的请求，之后会跳转至该请求路径
    @RequestMapping("/error")
    public @ResponseBody Object error(){
        return  "error";
    }
}
