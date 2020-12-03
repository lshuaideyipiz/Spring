package edu.nf.ch08.factorybean;

import edu.nf.ch08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author LZ
 * @date 2020/12/2
 * 通过自定义FactoryBean来创建mybatis的mapper接口的代理对象
 * 这里的T表示任意Dao接口的
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {
    /**
     * 由于JDk动态代理创建对象需要传入一个接口，
     * 而这个接口可以通过set方法注入进来
     */
    private Class<T> daoInterface;

    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    /**
     * 提供一个set方法注入一个Dao的接口的Class对象
     * @return
     * @throws Exception
     */
    /**
     * 当IOC容器调用getObjectType方法时，返回的是SqlSession的getMapper的代理对象
     * 这个代理对象就可以纳入容器中管理
     */
    public T getObject() throws Exception {
        //SqlSession就是具体的连接对象，它封装了Connection等jdbc的API，用来操作数据库
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //daoInterface就是某个Dao接口的Class对象
        //通过getMapper方法返回一个代理实现类
        T mapperProxy = sqlSession.getMapper(daoInterface);
        return mapperProxy;
    }


    public Class<?> getObjectType() {
        return daoInterface;
    }

    public boolean isSingleton() {
        return true;
    }
}
