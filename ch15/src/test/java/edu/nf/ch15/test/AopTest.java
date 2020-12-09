package edu.nf.ch15.test;

import edu.nf.ch15.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/12/8
 */
public class AopTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("userService",UserService.class);
        service.add();

    }
}
