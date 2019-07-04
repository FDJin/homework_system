package gxun.soft.homework_system.controller.admin;

import gxun.soft.homework_system.domain.Class;
import gxun.soft.homework_system.service.ClassService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClassManageController {

    @Autowired
    private ClassService classService;

    @ApiOperation(value = "班级管理")
    @GetMapping("/classList")
    public String classManage(){
        return "admin/classList";
    }

    @ApiOperation(value = "查询所有班级")
    @GetMapping("/findAllClassList")
    public List<Class> getClassList(){
        List<Class> classList = classService.getAllClasses();
        for (Class myclass: classList
             ) {
            System.out.println(myclass);
        }
        return classList;
    }

}
