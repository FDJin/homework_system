package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List  selectAccountById(Integer account);
    int addAccount(Account account);
    int deleteAccount(Account account);
    int updateAccount(Account account);
    Account getAccountById();
    List<Account> getAllAccounts();

}
