package edu.nf.ch07;

import edu.nf.ch07.demo1.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/12/2
 */
public class SpringTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserService service = applicationContext.getBean("userService",UserService.class);
        UserService service1 = applicationContext.getBean("userService",UserService.class);
        System.out.println(service);
        System.out.println(service1);
    };
}
