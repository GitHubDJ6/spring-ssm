package top.dj.web;

import org.springframework.web.bind.annotation.*;

//声明这个处理器所有的返回信息都以流写在前台界面
@RestController
//窄化搜索
@RequestMapping("/User")
public class UserController {

    @GetMapping("/queryAllUser")
    public String queryAllUser(){
        return null;
    }
    @GetMapping("/queryUserById")
    public String queryUserById(){
        return null;
    }
    @DeleteMapping("/deleteUserById")
    public String deleteUserById(){
        return null;
    }
    @PutMapping("/updateUserById")
    public String updateUserById(){
        return null;
    }
    @PostMapping("/addUser")
    public String addUser(){
        return null;
    }
}
