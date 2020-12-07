package edu.nf.ch09_1.test;

import edu.nf.ch09_1.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PublicKey;

/**
 * @author LZ
 * @date 2020/12/3
 */
public class SpringTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = applicationContext.getBean("userController",UserController.class);
        userController.add();
    }
}
