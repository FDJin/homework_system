package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    //登录操作

    Account accountLogin(@Param("userId") Integer userId, @Param("password") String password);

}
