package edu.nf.ch07.demo1;

import edu.nf.ch07.demo1.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author LZ
 * @date 2020/12/2
 * 自定义FactoryBean，用于创建自定义对象
 * FactoryBean就是一个工厂，规范了标准
 */
public class MyFactoryBean implements FactoryBean<UserService>{

    /**
     *
     * 返回的是具体的实现类的bean
     * @return
     * @throws Exception
     * 当Spring容器回电用FactoryBean的getObject方法，将返回的对象自动纳入IOC容器中
     */
    public UserService getObject() throws Exception {
        return new UserServiceImpl();
    }

    /**
     * 返回的是bean的类型
     * @return
     */
    public Class<?> getObjectType() {
        return UserServiceImpl.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
