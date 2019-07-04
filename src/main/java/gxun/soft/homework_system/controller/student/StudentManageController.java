package gxun.soft.homework_system.controller.student;

import com.alibaba.fastjson.JSONArray;
import gxun.soft.homework_system.component.ToJsonArray;
import gxun.soft.homework_system.domain.Student;
import gxun.soft.homework_system.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentManageController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "学生管理")
    @GetMapping("/studentList")
    public String classManage(){
        return "student/workList";
    }

    @ApiOperation(value = "查询所有学生")
    @ResponseBody
    @GetMapping("/findAllStudentList")
    public String getStudentList(Model model){
        List<Student> studentList = studentService.getAllStudent();
        model.addAttribute("studentList",studentList);
//        JSONArray studentListJsonArray = ToJsonArray.studentListToJsonArray(studentList);
        return null;
    }
}
