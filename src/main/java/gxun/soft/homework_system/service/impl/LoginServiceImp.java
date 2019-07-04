package gxun.soft.homework_system.service.impl;


import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.mapper.LoginMapper;
import gxun.soft.homework_system.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    /**
     * 用户登录
     * @param account
     * @return
     */
    @Override
    public Account accountLogin(@Param("account") Account account){
        System.out.println("account>>>>>>>>>!!!!!"+account.toString());
        account = loginMapper.accountLogin(account);
        return account;
    }
}
