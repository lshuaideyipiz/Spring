package edu.nf.ch02;

import jdk.nashorn.internal.runtime.UserAccessorProperty;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/11/30
 */
public class PeopleTest {
    @Test
    public void people(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        People people = applicationContext.getBean("people",People.class);
        people.say();
    }
}
