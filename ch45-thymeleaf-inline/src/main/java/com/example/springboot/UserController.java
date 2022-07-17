package com.example.springboot;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
    @RequestMapping("/inline")
    public String eachList(Model model){
        model.addAttribute("data","spring");

      return "inline-text";
    }


}






