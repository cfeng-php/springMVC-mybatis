package com.mvc.ssm.module.demo.service.impl;

import com.mvc.ssm.module.demo.mapper.UserMapper;
import com.mvc.ssm.module.demo.pojo.User;
import com.mvc.ssm.module.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getOneByName(String name) {
        return userMapper.getOneByName(name);
    }
}
