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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClassManageController {

    @Autowired
    private MyClassService myClassService;

    @ApiOperation(value = "班级列表")
    @GetMapping("/classList")
    public String getClassList(Model model){
        List<MyClass> myClassList = myClassService.getAllClasses();
        model.addAttribute("myClassList", myClassList);
        return "admin/classList";
    }

    @ApiOperation(value = "班级查询")
    @PostMapping("/findByClassName")
    public String findByClassName(@Param("className")String className, Model model){
        List<MyClass> myClassList = myClassService.findClassByClassName(className);
        model.addAttribute("myClassList", myClassList);
        return "admin/classList";
    }
//
//    @ApiOperation(value = "班级添加")
//    @GetMapping("/addClass")
//    public String findByClassName(@Param("className")String className,@Param("classId") Integer classId,
//                                   Model model){
//        MyClass myClass = new MyClass();
//        myClass.setClassId(classId);
//        myClass.setClassName(className);
//        myClassService.addClass(myClass);
//        List<MyClass> myClassList = myClassService.getAllClasses();
//        model.addAttribute("myClassList", myClassList);
//        return "admin/classList";
//    }

    @ApiOperation(value = "班级删除")
    @GetMapping("/deleteClass")
    public String findByClassName(@Param("classId") Integer classId,
                                  Model model){
        myClassService.deleteClassByClassId(classId);
        List<MyClass> myClassList = myClassService.getAllClasses();
        model.addAttribute("myClassList", myClassList);
        return "admin/classList";
    }

}
