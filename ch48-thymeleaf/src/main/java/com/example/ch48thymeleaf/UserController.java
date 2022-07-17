package com.example.ch48thymeleaf;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


@Controller
public class UserController {

    @RequestMapping("/expression")
    public String expression(HttpServletRequest request,Model model){
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
        model.addAttribute("username","lisi");
        request.getSession().setAttribute("data","session");
      return "expression";
    }

    @RequestMapping("/function")
    public String function(Model model){
        model.addAttribute("time",new Date());
        model.addAttribute("data","spreingdgds");
        model.addAttribute("currentPage",2);
        return "function";
    }

}






