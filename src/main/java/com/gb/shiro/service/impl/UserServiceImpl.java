package com.gb.shiro.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gb.shiro.entity.User;
import com.gb.shiro.mapper.UserMapper;
import com.gb.shiro.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
