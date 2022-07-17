package com.example.ch17springmvc.controller;

import com.example.ch17springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController  //这个注解相当于 @Controller+ 所有方法上都自带 @ResponseBody，
                //意味着当前控制层类中所有方法返还的都是JSON对象
public class StudentController {

    @RequestMapping("student")
    //@ResponseBody
    public  Object student(){
        Student student=new Student();
        student.setId(1001);
        student.setName("zhangsan");
        return student;
    }

    //该方法请求方式支持：用get和post的方式都行
    @RequestMapping(value = "/queryStudentById",method = {RequestMethod.GET,RequestMethod.POST})//methhod可以省略
    public Object student2(Integer id){
        Student student=new Student();
        student.setId(id);
        return student;
    }

    //该方法请求方式支持：get
   // @RequestMapping(value = "/queryStudentById2",method = RequestMethod.GET)
    @GetMapping(value = "/queryStudentById2") //相当于上面的那个注解 只接受get请求 否则报405
    //该注解通常在查询数据时用
    public Object queryStudentById2(){
        return "Ony GET Method";
    }

    //该方法请求方式支持：post
    //@RequestMapping(value = "/insert",method = RequestMethod.POST)
    @PostMapping(value = "/insert") //相当于上面的那个注解 只接受get请求 否则报405
    //该注解通常在新增数据时用
    public Object insert(){
        return "insert success";
    }

    //该方法请求方式支持：delete
    @DeleteMapping(value = "/delete") //相当于上面的那个注解 只接受get请求 否则报405
    //该注解通常在删除数据时用
    public Object delete(){
        return "delete success";
    }

    //该方法请求方式支持：Put
    @PutMapping(value = "/put") //相当于上面的那个注解 只接受get请求 否则报405
    //该注解通常在修改数据时用 更新操作
    public Object put(){
        return "put success";
    }

}

