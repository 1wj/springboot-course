package com.example.springboot;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @RequestMapping("/operator")
    public String operator(Model model){
        model.addAttribute("data","spring");
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
      return "operator";
    }

    @RequestMapping("/splice")
    public String splice(Model model){
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",13);
        model.addAttribute("currentPage",2);
        return "splice";
    }

}






