package edu.nf.ch08_1.dao;

import edu.nf.ch08_1.entity.Users;

import java.util.List;

/**
 * @author LZ
 * @date 2020/12/2
 */
public interface UserDao {
    List<Users> listUser();
}
