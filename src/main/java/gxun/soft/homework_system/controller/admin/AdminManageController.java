package gxun.soft.homework_system.controller.admin;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Admin;
import gxun.soft.homework_system.domain.Teacher;
import gxun.soft.homework_system.mapper.AdminMapper;
import gxun.soft.homework_system.service.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminManageController {

    @Autowired
    AdminService adminService;

    @ApiOperation(value = "管理员更新密码")
    @PostMapping("/updateAdminPassword")
    public String updateAdminPassword(@RequestParam("adminId") Integer adminId,
                                @RequestParam("password") String password,
                                Model model){
        Account account = new Account();
        account.setUserId(adminId);
        account.setPassword(password);
        adminService.updatAdminPassword(account);
        List<Admin> adminList = adminService.getAllAdmins();
        model.addAttribute("adminList",adminList);
        return "admin/profile";
    }
}
