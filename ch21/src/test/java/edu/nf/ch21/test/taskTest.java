package edu.nf.ch21.test;

import edu.nf.ch21.config.AddConfig;
import edu.nf.ch21.service.TaskService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LZ
 * @date 2020/12/9
 */
public class taskTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AddConfig.class);
        while (true);
    }
}
