package gxun.soft.homework_system.component;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import gxun.soft.homework_system.domain.MyClass;
import gxun.soft.homework_system.domain.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

public class ToJsonArray {
    public static JSONArray classListToJsonArray(List<MyClass> classList){
        JSONArray jsonArray = new JSONArray();
        for (MyClass myClass: classList
             ) {
            JSONObject object = new JSONObject();
            object.put("className", myClass.getClassName());
            object.put("classId", myClass.getClassId());
            jsonArray.add(object);
        }
        return jsonArray;
    }

    public static JSONArray teacherListToJsonArray(List<Teacher> teacherList){
        JSONArray jsonArray = new JSONArray();
        for (Teacher teacher: teacherList
        ) {
            JSONObject object = new JSONObject();
            object.put("teaId", teacher.getTeaId());
            object.put("classId", teacher.getClassId());
            object.put("teaName", teacher.getTeaName());
            jsonArray.add(object);
        }
        return jsonArray;
    }
}
