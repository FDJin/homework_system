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
package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
    //用户登录
    Account accountLogin(@Param("userId") Integer userId, @Param("password") String password);
    int updatePassword(Account account);
    Account findAccountById(Integer id);
    int addAccount(Account account);
}
