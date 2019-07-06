package gxun.soft.homework_system.controller;


import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.service.LoginService;
import gxun.soft.homework_system.service.impl.LoginServiceImp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Api(value = "登录")
@Controller
public class LogController {
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

//
//    //修改密码页面
//    @RequestMapping(value = {"/updatepassword"})
//    public String updatePassword(Model model, Integer id){
////        User user=userLoginService.findById(id);
////        model.addAttribute("user",user);
//        return "password";
//    }
//    //修改密码功能
//    @PostMapping("/updatepassword")
//    public String update(Account account, HttpServletRequest request, Model model){
//        String password = request.getParameter("password");
//        if(password != null){
//            model.addAttribute("msg","密码错误!请重新输入");
//            loginServiceImp.updatePassword(account);
//            return "redirect:login";
//        }else{
//            return "password";
//        }
//    }
//    //修改个人资料页面
//    @RequestMapping(value = {"/updateprofile"})
//    public String updateprofile(){
//
//        return "profile";
//    }

    /**
     * 登录
     * @param
     * @param
     * @param
     * @return
     */
    @ApiOperation(value = "登录")
   @PostMapping(value = {"/login"})
    public String login(@RequestParam("userId") String userId,
                         @RequestParam("password") String password,
                         HttpSession session) {
        Account account = new Account();
        Integer id = Integer.parseInt(userId);
        String psw = password;
        account.setUserId(id);
        account.setPassword(psw);
        account = loginService.accountLogin(account);
        System.out.println("account has type >>>>>>>>>!!!!!"+account.toString());
        if (account != null) {
            session.setAttribute("userId", userId);
            session.setAttribute("password",password);
            Integer accountType = account.getAccountType();
            switch (accountType){
                case 0:
                    return "student/workList";
                case 1:
                    return "teacher/workList";
                case 2:
                    return "admin/admin";
                    default: return "index";

            }
        } else {
            System.out.println("账号不存在>>>>>>>重新登录");
            return "index";
        }

    }

   @GetMapping(value = {"/logout"})
    public String loginout(HttpServletRequest request){
        if(request.getSession().getAttribute("user")!=null){
            request.getSession().removeAttribute("user");
        }
        return "login";
    }

}
