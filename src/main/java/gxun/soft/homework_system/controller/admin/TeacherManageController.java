package gxun.soft.homework_system.controller.admin;

import gxun.soft.homework_system.domain.Teacher;
import gxun.soft.homework_system.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeacherManageController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "教师管理")
    @GetMapping("/teacherList")
    public String getClassList(Model model){
        List<Teacher> teacherList = teacherService.getAllTeacher();
        model.addAttribute("teacherList",teacherList);
        return "admin/teacherList";
    }
}
