package com.zfly.order.service;

import com.codingapi.tx.annotation.TxTransaction;
import com.zfly.order.controller.UserControllerIntf;
import com.zfly.order.dao.GoodsMapper;
import com.zfly.order.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yu.zou
 * @description
 * @create 2018-07-18
 * @modify by
 */
@Service("goodsService")
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    private UserControllerIntf userControllerIntf;

    /**
     * 开启分布式事务（发起方）
     * @param name
     * @return
     */
    @TxTransaction(isStart = true)
    @Transactional
    public Integer buyGoods(String name){
        Goods goods =  goodsMapper.selectByPrimaryKey(1);
        goods.setNum(goods.getNum() - 1);
        int i = userControllerIntf.buyGoods(name);
        int n = goodsMapper.updateByPrimaryKey(goods);
        i = i/0;
        return i+n;
    }
}
