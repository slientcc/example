package com.saber.example_api.controller;

import com.saber.entity.User;
import com.saber.bean.Response;
import com.saber.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;


/**
 * @author saber
 * @version 1.0
 * @create_time 2018/2/23 上午11:50
 */
@RestController
@RequestMapping("/saber")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user", produces = "application/json")
    public Response<User> getAllUser() {
        logger.info("查询用户信息");
        return Response.ok(userService.getUserById(1));
    }

    @GetMapping("/")
    public Map<String, Object> greeting() {
        return Collections.singletonMap("message", "Hello World");
    }
}
