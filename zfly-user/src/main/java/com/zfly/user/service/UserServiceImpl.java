package com.zfly.user.service;

import com.codingapi.tx.annotation.ITxTransaction;
import com.codingapi.tx.annotation.TxTransaction;
import com.zfly.user.dao.UserMapper;
import com.zfly.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yu.zou
 * @description
 * @create 2018-07-19
 * @modify by
 */
@Service("userService")
public class UserServiceImpl implements UserService,ITxTransaction{
    @Autowired
    UserMapper userMapper;

    /**
     * 类继承ITxTransaction接口,并且事务注解
     * 分布式事务(参与方)
     * @param name
     * @return
     */
    @Override
    @Transactional
    public int buyGoods(String name) {
        User user = userMapper.selectByPrimaryKey(1);
        user.setAmount(user.getAmount() - 1);
        int i=  userMapper.updateByPrimaryKey(user);
        return i;
    }
}
