package edu.nf.ch06;

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
        /*3种方式获取
        * 1.id
        * 2.name
        * 3.直接通过类.class*/
        /*applicationContext.getBean(Users.class);*/
        Users users = applicationContext.getBean("user",Users.class);
        users.getUserName();
        users.getAge();
        users.getAddress().forEach(addr -> System.out.println(addr));
        users.getCard().forEach((k,v)-> System.out.println(k+":"+v));
        users.getProp().getProperty("aa");
        users.getProp().getProperty("bb");
    }

}
