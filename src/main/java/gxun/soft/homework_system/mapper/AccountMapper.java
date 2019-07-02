//package gxun.soft.homework_system.mapper;
//
//import org.apache.ibatis.annotations.Mapper;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
//import gxun.soft.homework_system.domain.Account;
//import com.alibaba.fastjson.JSONObject;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//public interface AccountMapper extends BaseMapper<Account> {
//
//    @Select("SELECT a.* FROM account a where 1=1 ${where}  order by userId desc")
//    List<JSONObject> queryAll(@Param("where") Integer userId);
//
//
//    @Select("SELECT * from account where 1 = 1 and number = '${number}'  ")
//    JSONObject queryUserByUserId(@Param("userId") Integer userId);
//
//
//    @Select("select count(1) total from account where 1=1 ${where} ")
//    JSONObject getPageCount(@Param("where") Integer where);
//
//    @Select("select count(1) total from account where 1=1  ")
//    JSONObject getPageCount_default();
//
//    @Select("SELECT a.* FROM account a " +
//            "JOIN (SELECT id from student where 1=1 ${where} order by userId desc LIMIT #{index}, #{size}" +
//            ")b ON a.id=b.id order by a.userId desc ")
//    List<JSONObject> getTeacherPage(@Param("where") Integer where,
//                             @Param("index") int index,
//                             @Param("size") int size);
//
//    @Select("SELECT a.* FROM account a " +
//            "JOIN (SELECT id from student where 1=1 ${where} order by userId desc LIMIT #{index}, #{size}" +
//            ")b ON a.id=b.id order by a.userId desc ")
//    List<JSONObject> getStudentPage(@Param("where") Integer where,
//                             @Param("index") int index,
//                             @Param("size") int size);
//}
