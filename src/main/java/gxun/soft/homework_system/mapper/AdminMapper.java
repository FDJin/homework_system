package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    //管理员操作

    int addAdmin(@Param("admin") Admin admin);

    Admin findAdminById(@Param("adminId") Integer adminId);

    List<Admin> getAllAdmins();

}

