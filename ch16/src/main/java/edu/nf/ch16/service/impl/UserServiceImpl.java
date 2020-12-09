package edu.nf.ch16.service.impl;

import edu.nf.ch16.service.UserService;

/**
 * @author LZ
 * @date 2020/12/8
 */
public class UserServiceImpl implements UserService
{
    public String add(String name) {
        System.out.println("add..........."+name);
        return "success";
    }
}
