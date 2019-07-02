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

        account=this.accountMapper.userLogin(account.getUserId(),account.getPassword());
        return account;
    }
    public int updatepassword(Account account){

        System.out.println(account);
        return accountMapper.updatepassword(account);
    }
    public Account findById(Integer id){
        return accountMapper.findById(id);
    }
    //添加用户
    public int addAccount(Account account){
        return accountMapper.addAccount(account);
    }
}
