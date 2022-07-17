package com.example.ch09customconfiguration.controller;


import com.example.ch09customconfiguration.config.Abc;
import com.example.ch09customconfiguration.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
   private Abc abc;

    @Autowired
    private School school;

    @RequestMapping("/say")
    public @ResponseBody Object say(String message){
        return "Say: hello1 "+message+abc.getName()+abc.getWebsite()
                +school.getWebsite()+school.getName();
    }
}
