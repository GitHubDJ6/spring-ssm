package top.dj.dao;

import org.apache.ibatis.annotations.*;
import top.dj.pojo.Account;

import java.util.List;

public interface AccountDao {
//    查询所有用户
    @Select("select * from account")
   List<Account> findAll();
//查询所有用户
    @Select("select * from account")
    List<Account> queryAllAccount();
    //    通过id删除用户
    @Delete("delete from account where id=#{id}")
    void deleteAccountById(Integer id);
    //    根据id更新用户信息
    @Update("update account set name=#{name},money=#{meney} where id=#{id}")
    void updateAccountById(Integer id,Account account);
    //    添加用户
    @Insert("insert into account values (null,#{name},#{money})")
    void addAccount(Account account);
}
