package com.saber.controller;

import com.saber.entity.User;
import com.saber.bean.Response;
import com.saber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author saber
 * @version 1.0
 * @create_time 2018/2/23 上午11:50
 */
@RestController
@RequestMapping("/saber")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user", produces = "application/json")
    public Response<User> getAllUser() {
        return Response.ok(userService.getUserById(1));
    }
}
