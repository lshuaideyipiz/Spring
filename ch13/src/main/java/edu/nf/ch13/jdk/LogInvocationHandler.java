package edu.nf.ch13.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LZ
 * @date 2020/12/7
 * 回调处理器，负责电泳目标对象的方法，
 * 因此可以再调用前后执行一些额外的逻辑
 */
public class LogInvocationHandler implements InvocationHandler {
    private Object target;

    /**
     *
     * @param target
     */
    public LogInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 运行时创建的代理对象
     * @param method 当前对象正在调用的方法
     * @param args 目标方法所需要的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(target,args);
        log();
        return null;
    }
    private void log(){
        System.out.println("执行日志");
    }
}
