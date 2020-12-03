package edu.nf.ch05;

import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/12/1
 */
public class IocTest {
    @Test
    public void testContainer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserService service = applicationContext.getBean("userService",UserService.class);
        Users users = new Users();
        service.add(users);
    }
}
