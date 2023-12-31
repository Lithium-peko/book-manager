package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Resource
    UserService service;

    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid) {
        return service.getUserById(uid);
    }
}
