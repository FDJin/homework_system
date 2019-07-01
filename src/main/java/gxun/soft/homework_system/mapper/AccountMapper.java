package gxun.soft.homework_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import gxun.soft.homework_system.domain.Account;

import java.util.List;

@Mapper
public interface AccountMapper {
    public Account selectAccountById(Integer account);
    int addAccount(Account account);
    int deleteAccount(Account account);
    int updateAccount(Account account);
    Account getAccountById();
    List<Account> getAllAccounts();

}
