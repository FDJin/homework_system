package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    Account accountLogin(Account account);
}
