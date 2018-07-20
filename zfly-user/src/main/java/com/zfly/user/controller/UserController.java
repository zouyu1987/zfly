package com.zfly.user.controller;

import com.zfly.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author yu.zou
 * @description
 * @create 2018-07-18
 * @modify by
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("buyGoods")
    public int buyGoods(@RequestBody String name){
        return userService.buyGoods(name);
    }
}
