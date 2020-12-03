package edu.nf.ch08.service.impl;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import edu.nf.ch08.service.UserService;

import java.util.List;

/**
 * @author LZ
 * @date 2020/12/2
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Users> listUser() {
        return userDao.listUser();
    }
}
