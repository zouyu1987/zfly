package com.zfly.user.service;

import com.codingapi.tx.annotation.ITxTransaction;
import com.codingapi.tx.annotation.TxTransaction;
import com.zfly.user.dao.UserMapper;
import com.zfly.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author yu.zou
 * @description
 * @create 2018-07-18
 * @modify by
 */

public interface UserService{

    public int buyGoods(String name);
}
