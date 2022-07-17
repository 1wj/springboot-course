package com.example.springboot;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
    @RequestMapping("/condition")
    public String eachList(Model model){

      model.addAttribute("sex",0);
      model.addAttribute("flag",true);
      model.addAttribute("productType",0);
      return "condition";
    }


}






