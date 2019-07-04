package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Admin;
import gxun.soft.homework_system.mapper.AccountMapper;
import gxun.soft.homework_system.mapper.AdminMapper;
import gxun.soft.homework_system.service.AccountService;
import gxun.soft.homework_system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    AccountMapper accountMapper;
    AdminMapper adminMapper;

    @Transactional
    @Override
    public int addAdmin(Map adminMap){
        Account account = (Account) adminMap.get("account");
        Admin admin = (Admin) adminMap.get("admin");
        accountMapper.addAccount(account);
        adminMapper.addAdmin(admin);
        return 0;
    }

    @Override
    public int updatAdminPassword(Account account){
        return accountMapper.updatePassword(account);
    }

    @Override
    public Admin findAdminByAdminId(Integer adminId) {
        return null;
    }

    @Override
    public List<Admin> getAllAdmins() {
        return null;
    }
}
