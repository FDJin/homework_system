package gxun.soft.homework_system.controller;


import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.service.LoginService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Api(value = "/")
@Controller
@RequestMapping("/")
public class LoginController {
    @Autowired
    private LoginService loginService;
//    /**
//     * 首页
//     * @return
//     */
//    @RequestMapping(value = {"/"})
//    public String index(){
//
//        return "login";
//    }
//    @RequestMapping("/index")
//    public String index1(){
//        return "index";
//    }


    //修改密码页面
    @RequestMapping(value = {"/updatepassword"})
    public String updatePassword(Model model, Integer id){
//        User user=userLoginService.findById(id);
//        model.addAttribute("user",user);
        return "password";
    }
    //修改密码功能
    @PostMapping("/updatepassword")
    public String update(Account account, HttpServletRequest request, Model model){
        String password = request.getParameter("password");
        if(password != null){
            model.addAttribute("msg","密码错误!请重新输入");
            loginService.updatePassword(account);
            return "redirect:login";
        }else{
            return "password";
        }
    }
    //修改个人资料页面
    @RequestMapping(value = {"/updateprofile"})
    public String updateprofile(){

        return "profile";
    }

    /**
     * 登录
     * @param
     * @param
     * @param request
     * @return
     */
   @PostMapping(value = {"/login"})
    public String login(Account account, HttpServletRequest request, HttpSession session) {
        Integer userId = Integer.parseInt(request.getParameter("userId"));
        String password = request.getParameter("password");
        account.setUserId(userId);
        account.setPassword(password);
        account =this.loginService.userLogin(account);
        if (account != null) {
            session=request.getSession();
            session.setAttribute("userId", userId);
            session.setAttribute("password",password);
            Integer accountType = account.getAccountType();
            switch (accountType){
                case 0:
//                    获取用户姓名
//                    String stuName = ...
                    return "student";
                case 1:
                    return "teacher";
                case 2:
                    return "admin";
                    default: return "login";
            }
        } else {
            return "login";
        }

    }
    @GetMapping
    @RequestMapping(value = {"/loginout"})
    public String loginout(Model model, HttpServletRequest request){
        if(request.getSession().getAttribute("user")!=null){
            request.getSession().removeAttribute("user");
        }
        return "login";
    }

}
