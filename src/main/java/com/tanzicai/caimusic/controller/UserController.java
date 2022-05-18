package com.tanzicai.caimusic.controller;


import com.tanzicai.caimusic.mapper.UserMapper;
import com.tanzicai.caimusic.service.UserService;
import com.tanzicai.caimusic.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {


    UserService userService;

    UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    List<UserVo> getUserList(){
        return  userService.list()
                .stream().map(userMapper::toUser).collect(Collectors.toList())
                .stream().map(userMapper::toVo).collect(Collectors.toList());
    }
}
