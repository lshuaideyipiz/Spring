package edu.nf.ch08_1;

import edu.nf.ch08_1.dao.UserDao;
import edu.nf.ch08_1.entity.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author LZ
 * @date 2020/12/2
 */
public class SpringTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserDao dao = applicationContext.getBean("userDao",UserDao.class);
        List<Users> list = dao.listUser();
        list.forEach(user-> System.out.println(user.getUserName()));
    }


}
