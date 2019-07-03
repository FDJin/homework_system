package gxun.soft.homework_system.service.accountManagement;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountManagementMapper;

    /**
     * 新增账户
     * @param account
     * @return
     */
    int addAccount(Account account){
        int result = accountManagementMapper.addAccount(account);
        return result;
    }

    /**
     * 修改密码
     * @param account
     * @return
     */
    int updatePassword(Account account){
        int result = accountManagementMapper.updatePassword(account);
        return result;
    }

    /**
     * 按ID查找账户
     * @param id
     * @return
     */
    Account findAccountById(Integer id){
        Account account = accountManagementMapper.findAccountById(id);
        return account;
    }

    /**
     * 查找所有用户
     * @return
     */
    List<Account> getAllAccounts(){
        List<Account> allAccounts = accountManagementMapper.getAllAccounts();
        return allAccounts;
    }
}
