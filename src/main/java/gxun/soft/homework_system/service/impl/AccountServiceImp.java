package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.mapper.AccountMapper;
import gxun.soft.homework_system.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements AccountService {
    @Autowired
    AccountMapper accountManagementMapper;

    /**
     * 新增账户
     * @param account
     * @return
     */
    @Override
    public int addAccount(Account account){
        int result = accountManagementMapper.addAccount(account);
        return result;
    }

    /**
     * 修改密码
     * @param account
     * @return
     */
    @Override
    public int updatePassword(Account account){
        int result = accountManagementMapper.updatePassword(account);
        return result;
    }

    /**
     * 按ID查找账户
     * @param id
     * @return
     */
    @Override
    public Account findAccountById(Integer id){
        Account account = accountManagementMapper.findAccountById(id);
        return account;
    }

    /**
     * 查找所有用户
     * @return
     */
    @Override
    public List<Account> getAllAccounts(){
        List<Account> allAccounts = accountManagementMapper.getAllAccounts();
        return allAccounts;
    }
}
