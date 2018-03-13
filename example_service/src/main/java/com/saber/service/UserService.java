package com.saber.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.saber.entity.User;

/**
 * @author saber
 * @version 1.0
 * @create_time 2018/2/26 下午4:34
 */
@Service(timeout = 5000)
public interface UserService {

    User getUserById(Integer id);
}
