package edu.nf.ch14.test;

import edu.nf.ch14.service.StuService;
import edu.nf.ch14.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/12/7
 */
public class AopTest {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) context.getBean("userServiceProxy");
        service.add();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuService service = (StuService) context.getBean("userServiceProxy");
        service.add();
    }
}
