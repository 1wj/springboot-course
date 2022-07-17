package com.example.cho3springbootcontextpath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "say : hello";
    }

    @RequestMapping("/mapvalue")
    public @ResponseBody Map<String,Object> mapvalue(){  //这个注解就是转换成json
        Map<String,Object> map=new HashMap<>();
        map.put("message","Stringboot project");
        return map;
    }
}
