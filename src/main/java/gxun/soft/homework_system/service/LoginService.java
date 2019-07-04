package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface LoginService {
    /**
     * 用户登录
     * @param account
     * @return
     */
    Account accountLogin(Account account);
}
