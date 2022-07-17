package com.example.ch40thymelead;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//解决不能刷新问题
@Controller
public class UserController {
    @RequestMapping("/index")
    public  String studentCount(Model model){
       model.addAttribute("data","thymeleaf某班引擎");
        return "message";
    }}
