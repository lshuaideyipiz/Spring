package edu.nf.ch08_2.dao;

import edu.nf.ch08_2.entity.Users;

import java.util.List;

/**
 * @author LZ
 * @date 2020/12/14
 */
public interface UserDao {
    List<Users> userList();
}
