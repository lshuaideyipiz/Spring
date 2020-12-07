package edu.nf.ch14.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author LZ
 * @date 2020/12/7
 * 定义一个切面，在这个类中声明需要增强的业务逻辑
 * 在运行时将切面里面的增强逻辑应用到具体的目标对象上
 * （类似于回调处理器InvocationHandler）
 * 这个切面可以是实现更多的接口来完成不同的增强
 *
 * Advice(通知、增强)
 * MethodBeforeAdvice用于实现前置通知，在调用目标方法前执行的逻辑
 * AfterReturningAdvice用于实现后置通知，在目标方法返回后在执行的逻辑
 * MethodInterceptor环绕通知，在目标方法前都执行
 * ThrowsAdvice在目标方法抛异常之后执行的逻辑
 */
public class UserServiceAspect implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {
    /**
     * 异常通知，该方法名必须为afterThrowing
     * 该方法还有三个参数可选（method，args，target）
     * 这三个要么全写，要么一个不写,
     * 异常通知过后，环绕后置和后置都不会执行
     * Exception必须写
     * @param e
     */
    public void afterThrowing(Exception e){
        System.out.println(e.getMessage());
    }


    /**
     * 环绕通知，在目标方法前都执行
     * @param methodInvocation
     * @return
     * @throws Throwable
     */
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前");
        Object returnVal = methodInvocation.proceed();
        System.out.println("后");
        return returnVal;
    }

    /**
     * 前置通知
     * @param method 当前目标对象正在调用的方法
     * @param objects   目标方法需要的参数
     * @param o 被代理的对线
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }

    /**
     *
     * @param o 目标方法的返回值
     * @param method 目标对象正在执行的方法
     * @param objects 目标方法所需的参数
     * @param o1 目标对象
     * @throws Throwable
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置同志1");
    }
}
