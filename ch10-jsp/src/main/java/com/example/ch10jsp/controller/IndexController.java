package com.example.ch10jsp.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class IndexController {


    @RequestMapping("/say")
    public ModelAndView  say(String message){
        ModelAndView mv=new ModelAndView();
        mv.addObject("message","hello springboot");
        mv.setViewName("say");
        return mv;
    }

    @RequestMapping("/index")//下面是吧model和view拆开了
    public String index(Model mode){
        mode.addAttribute("message","helloworld");
        return "say";
    }
}
