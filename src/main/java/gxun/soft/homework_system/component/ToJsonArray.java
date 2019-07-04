package gxun.soft.homework_system.component;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import gxun.soft.homework_system.domain.MyClass;
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
}
