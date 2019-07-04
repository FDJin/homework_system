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
import java.util.List;

@Mapper
public interface AccountMapper {

    //账户操作

    int addAccount(@Param("account") Account account);

    int deleteAccountByUserId(@Param("userId") Integer userId);

    int updatePassword(@Param("account") Account account);

    Account findAccountByUserId(@Param("userId") Integer userId);

    List<Account> getAllAccounts();

}
