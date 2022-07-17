package com.example.ch41thymeleaf2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user/detail")
    public  String studentCount(Model model){

       model.addAttribute("data","thymeleaf某班引擎22");

        return "message";
    }}
