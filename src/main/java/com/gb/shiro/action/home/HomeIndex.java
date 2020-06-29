package com.gb.shiro.action.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeIndex {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
