package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {

    Account accountLogin(@Param("userId") Integer userId, @Param("password") String password);

}
