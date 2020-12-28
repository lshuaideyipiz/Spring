package edu.nf.ch08_2.factoryBean;

import edu.nf.ch08_2.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author LZ
 * @date 2020/12/14
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> daoInterface;

    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    public T getObject() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession(true);
        T proxy = sqlSession.getMapper(daoInterface);
        return proxy;
    }

    public Class<?> getObjectType() {
        return daoInterface;
    }

    public boolean isSingleton() {
        return true;
    }
}
