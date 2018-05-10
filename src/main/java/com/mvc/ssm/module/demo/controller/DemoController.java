package com.mvc.ssm.module.demo.controller;

import com.mvc.ssm.module.demo.pojo.User;
import com.mvc.ssm.module.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public User demo() {
        User user = userService.getOneByName("admin");
        return user;
    }
}
