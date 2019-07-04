package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.mapper.AccountMapper;
import gxun.soft.homework_system.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImp implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public int addAccount(Account account) {
        return accountMapper.addAccount(account);
    }

    @Override
    public int deleteAccountByUserId(Integer userId) {
        return accountMapper.deleteAccountByUserId(userId);
    }

    @Override
    public int updatePassword(Account account) {
        return accountMapper.updatePassword(account);
    }

    @Override
    public Account findAccountByUserId(Integer userId) {
        return accountMapper.findAccountByUserId(userId);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountMapper.getAllAccounts();
    }
}
