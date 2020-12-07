package edu.nf.ch09_1.controller;

import edu.nf.ch09_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author LZ
 * @date 2020/12/3
 */
@Controller
public class UserController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        userService.add();
    }
    @PostConstruct
    public void init(){
        System.out.println("自定义init............");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("自定义destroy...........");
    }

}
