package edu.nf.ch17.test;

import edu.nf.ch17.service.StuService;
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
        StuService stuService = context.getBean("stuServiceImpl",StuService.class);
        stuService.save("stu1");
    }
}
