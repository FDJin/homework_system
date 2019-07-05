package gxun.soft.homework_system.controller.admin;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Teacher;
import gxun.soft.homework_system.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TeacherManageController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "教师列表")
    @GetMapping("/teacherList")
    public String teacherList(Model model){
        List<Teacher> teacherList = teacherService.getAllTeacher();
        model.addAttribute("teacherList",teacherList);
        return "admin/teacherList";
    }

    @ApiOperation(value = "教师添加")
    @PostMapping("/addTeacher")
    public String addTeacher(@RequestParam("teaName") String teaName,
                               @RequestParam("teaId") Integer teaId,
                               @RequestParam("classId") Integer classId,
                               @RequestParam("password") String password,
                               Model model){

        Account account = new Account();
        Teacher teacher = new Teacher();
        Map teacherMap = new HashMap();

        account.setUserId(teaId);
        account.setPassword(password);
        account.setAccountType(1);

        teacher.setTeaId(teaId);
        teacher.setClassId(classId);
        teacher.setTeaName(teaName);

        teacherMap.put("account",account);
        teacherMap.put("teacher",teacher);
        teacherService.addTeacher(teacherMap);

        List<Teacher> teacherList = teacherService.getAllTeacher();
        model.addAttribute("teacherList",teacherList);
        return "admin/teacherList";
    }

    @ApiOperation(value = "教师查询")
    @PostMapping("/findByTeacherName")
    public String FindByTeacherName(@RequestParam("teaName") String teaName,
                                    Model model){
        List<Teacher> teacherList = teacherService.findTeacherByTeacherName(teaName);
        model.addAttribute("teacherList",teacherList);
        return "admin/teacherList";
    }

    @ApiOperation(value = "教师删除")
    @DeleteMapping("/deleteTeacher")
    public String DeleteTeacher(@RequestParam("teaId") Integer teaId,
                                Model model){
        teacherService.deleteTeacherByTeacherId(teaId);
        List<Teacher> teacherList = teacherService.getAllTeacher();
        model.addAttribute("teacherList",teacherList);
        return "admin/teacherList";
    }


    @ApiOperation(value = "教师更新")
    @PostMapping("/updateTeacherPassword")
    public String UpdateTeacherPassword(@RequestParam("teaId") Integer teaId,
                                        @RequestParam("password") String password,
                                        Model model){
        Account account = new Account();
        account.setUserId(teaId);
        account.setPassword(password);
        teacherService.updateTeacherPassword(account);
        List<Teacher> teacherList = teacherService.getAllTeacher();
        model.addAttribute("teacherList",teacherList);
        return "admin/teacherList";
    }




}
