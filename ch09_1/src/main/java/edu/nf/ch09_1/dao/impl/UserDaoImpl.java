package edu.nf.ch09_1.dao.impl;

import edu.nf.ch09_1.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author LZ
 * @date 2020/12/3
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save.............");
    }
}
