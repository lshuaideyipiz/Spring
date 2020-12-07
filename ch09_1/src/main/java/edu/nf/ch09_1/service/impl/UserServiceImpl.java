package edu.nf.ch09_1.service.impl;

import edu.nf.ch09_1.dao.UserDao;
import edu.nf.ch09_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author LZ
 * @date 2020/12/3
 */
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.save();
    }
}
