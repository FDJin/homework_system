package gxun.soft.homework_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import gxun.soft.homework_system.domain.account;

@Mapper
public interface accountMapper {
    public account selectAccountById(Integer account);
}
