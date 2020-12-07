package edu.nf.ch13.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author LZ
 * @date 2020/12/7
 */
public class LogInterceptor implements MethodInterceptor {
    /**
     *
     * @param o 运行时创建的代理对象
     * @param method 当前目标对象正在调用的方法
     * @param objects 目标对象需要的参数
     * @param methodProxy 代理方法（也就是生成子类中的方法）
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object returnVal = methodProxy.invokeSuper(o,objects);
        log();
        return returnVal;
    }
    private void log(){
        System.out.println("日志.......");
    }

}
