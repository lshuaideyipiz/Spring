package edu.nf.ch09;

import edu.nf.ch09.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/12/3
 */
public class SpringTes {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = applicationContext.getBean("controller",UserController.class);
        controller.add();
    }

}
