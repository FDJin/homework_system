package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AdminService {
    /**
     * 新增管理员
     * @param adminMap
     * @return
     */
    int addAdmin(Map adminMap);

    /**
     * 修改管理员密码
     * @param account
     * @return
     */
    int updatAdminPassword(Account account);

    /**
     * 按adminId查找管理员
     * @param adminId
     * @return
     */
    Admin findAdminByAdminId(Integer adminId);

    /**
     * 获取所有管理员信息
     * @return
     */
    List<Admin> getAllAdmins();
}
