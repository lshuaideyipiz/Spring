package edu.nf.ch04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

/**
 * @author LZ
 * @date 2020/12/1
 */
public class SpringTes {
    @Test
    public void testLife(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        applicationContext.getBean("users",Users.class);
        //ApplicationContext接口没有close方法，实现类有，当这里关闭的时候，会执行所有bean的destroy方法
        ((ClassPathXmlApplicationContext)applicationContext).close();
        /*bean的初始化方法
        1.实现InitializingBean接口的AfterPropertiesSet
        2.Bean中自定义初始化方法，在bean中用init—method配置
        如果两种方式都存在，两者都会执行，但InitializingBean优先

        生命周期的执行顺序
        1.构造方法
        2.InitializingBean的AfterPropertiesSet
        3.init-method
        4.DisposableBean的destroy
        5.destroy-method
        */
    }

}
