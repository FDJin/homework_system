package gxun.soft.homework_system.controller.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import gxun.soft.homework_system.component.ToJsonArray;
import gxun.soft.homework_system.domain.MyClass;
import gxun.soft.homework_system.service.MyClassService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClassManageController {

    @Autowired
    private MyClassService myClassService;

    @ApiOperation(value = "班级管理")
    @GetMapping("/classList")
    public String classManage(){
        return "admin/classList";
    }

    @ApiOperation(value = "查询所有班级")
    @ResponseBody
    @GetMapping("/findAllClassList")
    public JSONArray getClassList(){
        List<MyClass> myClassList = myClassService.getAllClasses();
        JSONArray classListJsonArray = ToJsonArray.classListToJsonArray(myClassList);
        return classListJsonArray;
    }
//
//    @ApiOperation(value = "班级模糊查询")
//    @ResponseBody
//    @GetMapping("/findClassByName")
//    public JSONArray findClassByName(@RequestParam String className){
//
//    }



}
