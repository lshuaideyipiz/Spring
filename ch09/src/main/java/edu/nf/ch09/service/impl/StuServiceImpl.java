package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LZ
 * @date 2020/12/3
 */
@Service
public class StuServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void add() {
        System.out.println("执行StuServiceImpl");
        userDao.save();
    }
}
