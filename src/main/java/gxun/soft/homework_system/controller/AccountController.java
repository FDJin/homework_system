package gxun.soft.homework_system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import gxun.soft.homework_system.domain.Account;

@Api(value = "账号管理")
@RestController
@RequestMapping("/v1")
public class AccountController {


    @PostMapping("/login")
    @ApiOperation(value = "用户统一登录")
    public Object login(@RequestBody gxun.soft.homework_system.domain.Account object){

        //用户名密码
        String password = object.getPassword();
        Integer userId = object.getUserId();

        //登录验证



        return "success";
    }
}
