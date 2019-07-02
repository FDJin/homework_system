package gxun.soft.homework_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class success {
    @RequestMapping("/stu")
    public String suc(){
        return "stu";
    }
}
