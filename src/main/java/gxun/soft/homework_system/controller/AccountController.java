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

}
