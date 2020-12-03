package edu.nf.ch09.dao.impl;

import edu.nf.ch09.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author LZ
 * @date 2020/12/3
 */
//标识Dao层，Repository仓库的意思，也就是持久的意思
@Repository
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("insert............");
    }
}
