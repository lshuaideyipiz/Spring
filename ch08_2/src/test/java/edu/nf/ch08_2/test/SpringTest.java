package edu.nf.ch08_2.test;

import edu.nf.ch08_2.entity.Users;
import edu.nf.ch08_2.service.UserService;
import edu.nf.ch08_2.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author LZ
 * @date 2020/12/15
 */
public class SpringTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
       UserService userService = applicationContext.getBean("userService", UserServiceImpl.class);
       List<Users> usersList = userService.listUser();
        for (Users user:usersList) {
            System.out.println(user.getUserName());
        }
    }
}
