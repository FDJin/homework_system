package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {
    /**
     * 账户登录
     * @param account
     * @return
     */
    Account accountLogin(@Param("account") Account account);
}
