//package gxun.soft.homework_system.mapper;
//
//import com.alibaba.fastjson.JSONObject;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
//import gxun.soft.homework_system.domain.Student;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//public interface StudentMapper extends BaseMapper<Student> {
//
//    @Select("SELECT s.* FROM student s where 1=1 ${where}  order by userId desc")
//    List<JSONObject> queryAll(@Param("where") Integer userId);
//
//
//    @Select("SELECT * from student where 1 = 1 and stuId = '${stuId}'  ")
//    JSONObject queryUserByStuId(@Param("stuId") Integer userId);
//
//
//}