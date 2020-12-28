package edu.nf.ch08_2.service.impl;

import edu.nf.ch08_2.dao.UserDao;
import edu.nf.ch08_2.entity.Users;
import edu.nf.ch08_2.service.UserService;

import java.util.List;

/**
 * @author LZ
 * @date 2020/12/14
 */
public class UserServiceImpl implements UserService
{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<Users> listUser() {
        return userDao.userList();
    }
}
