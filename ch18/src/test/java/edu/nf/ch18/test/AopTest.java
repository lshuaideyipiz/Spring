package edu.nf.ch18.test;

import edu.nf.ch18.config.SpringConfig;
import edu.nf.ch18.service.StuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/12/9
 */
public class AopTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StuService stuService = context.getBean("stuServiceImpl",StuService.class);
        stuService.save("stu1");
    }
}
