package com.example.ch37war.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("/user/detail")
    public @ResponseBody Object userDetail(){

        Map<String,Object> map=new HashMap<>();
        map.put("id",1001);
        map.put("name","lisi");
        return map;
    }

    @RequestMapping("/user/page/detail")
    public String userDetail2(Model model){
      model.addAttribute("id",1003);
      model.addAttribute("name","zs");
        return "useDe";
    }
}
