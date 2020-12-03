package edu.nf.ch08;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import edu.nf.ch08.service.UserService;
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
        UserService service = applicationContext.getBean("userService",UserService.class);
        List<Users> list = service.listUser();
        list.forEach(user -> System.out.println(user.getUserName()));

    }
}
