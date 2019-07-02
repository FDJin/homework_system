package gxun.soft.homework_system.service;


import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private AccountMapper accountMapper;
    //用户登录
    public Account userLogin(Account account){

        account=this.accountMapper.accountLogin(account.getUserId(),account.getPassword());
        return account;
    }
    public int updatePassword(Account account){

        System.out.println(account);
        return accountMapper.updatePassword(account);
    }
    public Account findById(Integer id){
        return accountMapper.findAccountById(id);
    }
    //添加用户
    public int addAccount(Account account){
        return accountMapper.addAccount(account);
    }
}
