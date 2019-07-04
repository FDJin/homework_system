package gxun.soft.homework_system.service.login;


import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    /**
     * 用户登录
     * @param account
     * @return
     */
    public Account accountLogin(Account account){
        account=this.loginMapper.accountLogin(account.getUserId(),account.getPassword());
        return account;
    }
}
