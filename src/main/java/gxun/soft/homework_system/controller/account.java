package gxun.soft.homework_system.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "账号管理")
@RestController
@RequestMapping("/v1")
public class account {


    @RequestMapping("/login")
    public String suc(){
        return "success";
    }
}
