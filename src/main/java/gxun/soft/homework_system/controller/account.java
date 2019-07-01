package gxun.soft.homework_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class account {
    @RequestMapping("/login")
    public String suc(){
        return "success";
    }
}
