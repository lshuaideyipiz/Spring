package edu.nf.ch05.service.Impd;

import edu.nf.ch05.dao.Impl.UserDaoImpl;
import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/12/1
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    //给spring一个注入的方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(Users users) {
        userDao.save(users);
    }
    public void add2(Users users){
        /*UserDao dao = new UserDaoImpl();
        dao.save(users);*/

        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserDao dao = applicationContext.getBean("userDao",UserDao.class);
        dao.save(users);*/

    }
}
