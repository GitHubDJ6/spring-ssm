/*
package top.top.dj.web;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.top.dj.pojo.Account;
import top.top.dj.service.AccountService;

import java.util.List;

//都以流的方式响应到浏览器
@RequestMapping("/Account")
@RestController
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountControl {
    @Autowired
    private AccountService service;
    @GetMapping("/queryAllAccount")
    public String queryAllAccount(){
        List<Account> list = service.findAll();
        System.out.println(list);
        System.out.println("测试完成");
        return "success";
    }
//    根据id删除账户
    @RequestMapping("/deleteAccountById")
    public String deleteAccountById(@RequestBody Integer id){
        System.out.println("idcontroller = " + id);
        service.deleteAccountById(id);
        return "删除";
    }
//    添加账户信息
    @PutMapping("/account/{id}/{account}")
    public String updateAccountById(@PathVariable Integer id, @PathVariable Account account){·
        System.out.println("测试完成put");
        return "更新";
    }
    @RequestMapping("/addAccount")
    public ModelAndView addAccount(@RequestBody Account account, ModelAndView modelAndView){
        modelAndView.addObject("msg","添加完成");
        modelAndView.setViewName("redirect:add.html");
        System.out.println("测试完成post");
        service.addAccount(account);
     return modelAndView;

    }
}
*/
