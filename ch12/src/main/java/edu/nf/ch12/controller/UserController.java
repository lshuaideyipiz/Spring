package edu.nf.ch12.controller;

import edu.nf.ch12.service.UserService;

/**
 * @author wangl
 * @date 2020/12/4
 */
public class UserController {

    private UserService service;

    public void setService(UserService service) {
        this.service = service;
    }

    public void add(){
        service.save();
    }
}
