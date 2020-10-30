package com.qf.mvc.controller;

import com.qf.mvc.entity.User;
import com.qf.mvc.service.UserService;
import com.qf.mvc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//@RestController= @Controller  +    @ResponseBody

@Controller
public class UserController {
/*
    @Resource
    UserService userService;
*/

    @GetMapping("/list")/*这是一个请求 代表请求路径*/
    @ResponseBody/*代表响应功能*/
    public List<User> users(){
        return new ArrayList<>();
    }

    @GetMapping("/user")/*映射路径*/
    @ResponseBody
    public User user(){
        return new User();
    }
}
