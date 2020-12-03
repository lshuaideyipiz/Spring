package edu.nf.ch01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZ
 * @date 2020/11/30
 * 在Spring框架中，工厂分为两类，一种是beanFactory，一种是ApplicationContext
 * BeanFactory是Spring最基础的bean工厂
 * ApplicationContext是对BeanFactory进行了增强，官方也推荐我们是用这个接口
 */
public class SpringContaninerTest {
    @Test
    public void testGetBean(){
        //初始化Spring容器，就是一个容器工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取对象
        Users users = (Users) applicationContext.getBean("user");
        //使用泛型来获取
        Users users1 = applicationContext.getBean("user",Users.class);
        users.say();;
        People people = applicationContext.getBean("people",People.class);
        people.run();
    }
    @Test
    public void testFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Users users = applicationContext.getBean("user1",Users.class);
        users.say();
    }
}
