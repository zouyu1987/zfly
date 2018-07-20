package com.zfly.order.controller;

import com.zfly.order.dao.GoodsMapper;
import com.zfly.order.model.Goods;
import com.zfly.order.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author yu.zou
 * @description
 * @create 2018-07-18
 * @modify by
 */
@RestController
public class OrderController {


    @Autowired
    GoodsService goodsService;

    @PostMapping("buyGoods")
    public int buyGoods(@RequestBody String name){
        if (Objects.nonNull(name)){
            return goodsService.buyGoods(name);
        }
        return 0;
    }


}
