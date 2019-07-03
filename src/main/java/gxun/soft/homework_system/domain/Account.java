package gxun.soft.homework_system.domain;

import com.baomidou.mybatisplus.annotations.TableName;

//
@TableName("account")
public class Account {
    private Integer userId;
    private String password;
    private Integer accountType;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }
}
