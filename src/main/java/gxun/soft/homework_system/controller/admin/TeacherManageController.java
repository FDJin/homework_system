package gxun.soft.homework_system.controller.admin;

import gxun.soft.homework_system.domain.Class;
import gxun.soft.homework_system.domain.Teacher;
import gxun.soft.homework_system.service.ClassService;
import gxun.soft.homework_system.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeacherManageController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "教师管理")
    @GetMapping("/teacherList")
    public String classManage(){
        return "admin/teacherList";
    }

    @ApiOperation(value = "查询所有老师")
    @GetMapping("/findAllTeacherList")
    public List<Teacher> getClassList(){
        List<Teacher> teacherList = teacherService.getAllTeacher();
        for (Teacher tea: teacherList
             ) {
            System.out.println(tea);
        }
        return teacherList;
    }

}
