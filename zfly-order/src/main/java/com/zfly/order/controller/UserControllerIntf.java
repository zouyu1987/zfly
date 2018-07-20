package com.zfly.order.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yu.zou
 * @description
 * @create 2018-07-18
 * @modify by
 */
@FeignClient(name = "zfly-user" ,url = "http://youbaolian.java.rd:8865/api/user",fallback=UserControllerHystric.class)
public interface UserControllerIntf {

    @RequestMapping(value = "/buyGoods", method = RequestMethod.POST)
    int buyGoods(@RequestBody String name);

}
