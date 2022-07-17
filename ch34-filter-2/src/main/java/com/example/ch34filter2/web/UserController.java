package com.example.ch34filter2.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/ddd")
    public @ResponseBody Object ddd() {
        return "jjjjj";
    }

    @RequestMapping("/center/ddd")
    public @ResponseBody Object ddd2() {
        return "dddd";
    }
}
