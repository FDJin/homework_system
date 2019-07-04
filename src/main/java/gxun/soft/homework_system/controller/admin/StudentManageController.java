package gxun.soft.homework_system.controller.admin;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Student;
import gxun.soft.homework_system.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentManageController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "学生列表")
    @GetMapping("/studentList")
    public String classManage(Model model){
        List<Student> studentList = studentService.getAllStudent();
        model.addAttribute("studentList",studentList);
        return "admin/studentList";
    }


    @ApiOperation(value = "学生添加")
    @GetMapping("/addStudent")
    public String AddStudent(@Param("stuId") Integer stuId,
                             @Param("stuName") String stuName,
                             @Param("classId") Integer classId,
                             @Param("password")String password,
                             Model model){
        Account account = new Account();
        Student student = new Student();
        Map studentMap = new HashMap();

        account.setUserId(stuId);
        account.setPassword(password);
        account.setAccountType(0);

        student.setStuId(stuId);
        student.setStuName(stuName);
        student.setClassId(classId);

        studentMap.put("account",account);
        studentMap.put("student",student);

        studentService.addStudent(studentMap);
        List<Student> studentList = studentService.getAllStudent();
        model.addAttribute("studentList",studentList);
        return "admin/studentList";
    }
}
