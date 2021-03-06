package com.example.ch09customconfiguration.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    String schoolName;

    @Value("${website}")
    String webSite;

    @RequestMapping("/say")
    public @ResponseBody Object say(String message){
        return "Say: hello "+message+schoolName+webSite;
    }
}
