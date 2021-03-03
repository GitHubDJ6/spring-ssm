package top.dj.service;
import top.dj.pojo.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();
//    查询所有账户并返回集合
    List<Account> queryAllAccount();
//    通过id删除用户
    void deleteAccountById(Integer id);
//    根据id更新用户信息
    void updateAccountById(Integer id,Account account);
//    添加用户
    void addAccount(Account account);
}
