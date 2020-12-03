package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Users;

import java.util.List;

/**
 * @author LZ
 * @date 2020/12/2
 */
public interface UserDao {
    List<Users> listUser();
}
