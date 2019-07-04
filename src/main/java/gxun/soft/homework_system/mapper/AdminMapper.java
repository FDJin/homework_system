package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    //管理员操作

    /**
     * 新增管理员
     * @param admin
     * @return
     */
    int addAdmin(@Param("admin") Admin admin);

    /**
     * 按adminId查找管理员
     * @param adminId
     * @return
     */
    Admin findAdminByAdminId(@Param("adminId") Integer adminId);

    List<Admin> getAllAdmins();

}

