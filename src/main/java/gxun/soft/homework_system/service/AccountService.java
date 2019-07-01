package gxun.soft.homework_system.service;


import gxun.soft.homework_system.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import gxun.soft.homework_system.domain.Account;


@Service
@Repository
public interface AccountService {
//    @Autowired
//    AccountMapper accountmapper;
    Account selectUserById(Integer userId);
}