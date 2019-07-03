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
public interface AccountManagementMapper {

    int addAccount(Account account);

    int updatePassword(Account account);

    Account findAccountById(Integer id);

    List<Account> getAllAccounts();

}
