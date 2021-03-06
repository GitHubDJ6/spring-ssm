package top.dj.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.dj.pojo.Account;
import top.dj.service.AccountService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test01SpringIOC {
    @Autowired
    private AccountService service;

    @Test
    public void testIoc(){
        List<Account> list = service.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
