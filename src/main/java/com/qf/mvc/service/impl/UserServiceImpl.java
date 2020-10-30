package com.qf.mvc.service.impl;

import com.qf.mvc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void shop(){
        System.out.println("helloworld");
    }
}
