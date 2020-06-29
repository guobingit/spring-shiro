package com.gb.shiro.action.home;

import com.gb.shiro.entity.User;
import com.gb.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeIndex {
    
    @Autowired
    private UserService userService;
    

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "index";
    }
    
    @RequestMapping("testdb")
    @ResponseBody
    public String testdb() {
        User user = userService.selectById(1);
        return user.getName();
    }
}
