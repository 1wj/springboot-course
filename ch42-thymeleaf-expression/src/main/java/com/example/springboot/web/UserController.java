package com.example.springboot.web;

import com.example.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/user/detail")
    public  String studentCount(Model model){
        User user=new User();
        user.setAge(18);
        user.setName("lisi");
        user.setId(1008);
        model.addAttribute("user",user);

        return "message";
    }

    @RequestMapping("/url")
    public  String url(Model model){
        User user=new User();
        user.setAge(19);
        user.setName("lisi");
        user.setId(1009);
        model.addAttribute("user",user);
        model.addAttribute("id",1001);
        model.addAttribute("age",19);
        model.addAttribute("username","wangwu");
        return "url";
    }

    @RequestMapping("/test")
    @ResponseBody
    public  String test(String username){

        return "请求路径/test，参数是："+username;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public  String test1(Integer id,String username,Integer age){

        return "请求路径/test，参数id是："+id+", username:"+username+" ,age:"+age;
    }

    @RequestMapping("/test2/{id}")
    @ResponseBody
    public  String test2(@PathVariable("id") Integer id){

        return "请求路径/test2,参数id是："+id;
    }

    @RequestMapping("/test3/{id}/{username}")
    @ResponseBody
    public  String test3(@PathVariable("id") Integer id,
                         @PathVariable("username") String username){
        return "请求路径/test2,参数id是："+id+" ,username:"+username;
    }
    @RequestMapping("/url2")
    public  String url2(Model model){
        return "url2";

    }
    @RequestMapping("/property")
    public  String property(Model model){
        return "property";

    }

}
