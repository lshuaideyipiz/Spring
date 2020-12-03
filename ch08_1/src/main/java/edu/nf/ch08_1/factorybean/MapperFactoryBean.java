package edu.nf.ch08_1.factorybean;

import edu.nf.ch08_1.dao.UserDao;
import edu.nf.ch08_1.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author LZ
 * @date 2020/12/2
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> daoInterface;

    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    public T getObject() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        return sqlSession.getMapper(daoInterface);

    }

    public Class<?> getObjectType() {
        return daoInterface;
    }

    public boolean isSingleton() {
        return true;
    }
}
