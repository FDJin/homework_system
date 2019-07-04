package gxun.soft.homework_system.controller.teacher;

import com.alibaba.fastjson.JSONArray;
import gxun.soft.homework_system.component.ToJsonArray;
import gxun.soft.homework_system.domain.MyClass;
import gxun.soft.homework_system.domain.Teacher;
import gxun.soft.homework_system.service.MyClassService;
import gxun.soft.homework_system.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    @GetMapping("/findAllTeacherList")
    public String getClassList(Model model){
        List<Teacher> teacherList = teacherService.getAllTeacher();
        model.addAttribute("teacherList",teacherList);
//        JSONArray teacherListJsonArray = ToJsonArray.teacherListToJsonArray(teacherList);
        return null;
    }
}
