package com.zfly.order.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yu.zou
 * @description
 * @create 2018-07-19
 * @modify by
 */
@Component
public class UserControllerHystric implements UserControllerIntf {

    @Override
    public int buyGoods(@RequestBody String name) {
        System.out.println("进入断路器-save。。。");
        throw new RuntimeException("save 保存失败.");
    }

}
