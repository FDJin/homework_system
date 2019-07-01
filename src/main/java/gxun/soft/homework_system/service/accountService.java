package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.account;
public interface accountService {
    account selectUserById(Integer userId);
}