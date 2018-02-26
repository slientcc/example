package com.saber.service.impl;

import com.saber.dao.UserDAO;
import com.saber.entity.User;
import com.saber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author saber
 * @version 1.0
 * @create_time 2018/2/26 下午4:35
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUserById(Integer id) {
        return userDAO.getUserById(id);
    }
}
