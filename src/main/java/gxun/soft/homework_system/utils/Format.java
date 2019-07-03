package gxun.soft.homework_system.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taller on 2017/9/9.
 */
public class Format {
    public static String s(String format,Object... str){
        return String.format(format,str);
    }

    public static List<JSONObject> f2l(List<JSONObject> objects,String... fields){
        if(objects.size() > 0){
            for(JSONObject object:objects){
                for(String field:fields){
                    object.put(field,object.getString(field));
                }
            }
            return objects;
        }else {
            return new ArrayList<>();
        }
    }

    public static List<JSONObject> g2l(List<JSONObject> objects,String... fields){
        List<JSONObject> temp = new ArrayList<>();
        if(objects.size() > 0){
            for(JSONObject object:objects){
                JSONObject o = new JSONObject();
                for(String field:fields){
                    o.put(field,object.get(field));
                }
                temp.add(o);
            }
            return temp;
        }else {
            return new ArrayList<>();
        }
    }

    public static JSONObject f2j(JSONObject objects,String... fields){
        if(!Verify.isEmpty(objects)) {
            for (String field : fields) {
                if (!Verify.isEmpty(objects.getString(field))) {
                    objects.put(field, objects.getString(field));
                }
            }
            return objects;
        }else{
            return null;
        }
    }

    public static JSONObject g2j(JSONObject objects,String... fields){
        if(!Verify.isEmpty(objects)) {
            JSONObject o = new JSONObject();
            for (String field : fields) {
                if (!Verify.isEmpty(objects.getString(field))) {
                    o.put(field, objects.getString(field));
                }
            }
            return o;
        }else{
            return null;
        }
    }

}
