package top.dj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.dj.dao.AccountDao;
import top.dj.pojo.Account;
import top.dj.service.AccountService;

import java.util.List;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;

    @Override
   @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Account> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Account> queryAllAccount() {
        List<Account> list = dao.queryAllAccount();
        System.out.println("查询结果");
        return list;
    }

    @Override
    public void deleteAccountById(Integer id) {
        dao.deleteAccountById(id);
        System.out.println("id = " + id);
        System.out.println("删除完成");

    }

    @Override
    public void updateAccountById(Integer id,Account account) {
        dao.updateAccountById(id,account);
        System.out.println("根据id更新用户信息");

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public void addAccount(Account account) {
        dao.addAccount(account);
        System.out.println("添加用户完成");

    }
}
