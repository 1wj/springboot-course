package com.example.ch18restful.controller;

import com.example.ch18restful.model.Student;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.BindingType;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @RequestMapping("/student")
    public Object student(Integer id,Integer age){
        Student student=new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    //RESTful请求风格
   // @RequestMapping("/student/detail/{id}/{age}")
    @GetMapping("/student/detail/{id}/{age}")
    public Object student2(@PathVariable("id") Integer id,
                           @PathVariable("age") Integer age){
        //用了RESTful请求风格  就需要 @PathVariable 注解 来获取请求路径中对应的值 （“id”）这个是参数矫正 可以省略
        Map<String,Object> map=new HashMap<>();
        map.put("id",id);
        map.put("age",age);
        return map;
    }

    //RESTful请求风格
   // @RequestMapping("/student/detail/{id}/{ss}")
    @DeleteMapping("/student/detail/{id}/{ss}")
    public Object student3(@PathVariable("id") Integer id,
                           @PathVariable("ss") Integer ss){
        //用了RESTful请求风格  就需要 @PathVariable 注解 来获取请求路径中对应的值 （“id”）这个是参数矫正 可以省略
        Map<String,Object> map=new HashMap<>();
        map.put("id",id);
        map.put("ss",ss);
        return map;
    }
    //以上代student2和student3会出现请求路线冲突的错误
    //解决方法一：通常RESTful风格中方法的请求方式会按增删改的请求方式来区分
    //RESTful请求风格要求路径中使用的单词都是名词，最后不要出现动词

}
