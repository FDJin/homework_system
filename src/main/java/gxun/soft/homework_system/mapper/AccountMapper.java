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

    /**
     * 新增账户
     * @param account
     * @return
     */
    int addAccount(@Param("account") Account account);

    /**
     * 按userId删除账户
     * @param userId
     * @return
     */
    int deleteAccountByUserId(@Param("userId") Integer userId);

    /**
     * 更新账户密码
     * @param account
     * @return
     */
    int updatePassword(@Param("account") Account account);

    /**
     * 按userId查找账户
     * @param userId
     * @return
     */
    Account findAccountByUserId(@Param("userId") Integer userId);

    /**
     * 获取全部账户
     * @return
     */
    List<Account> getAllAccounts();

}
