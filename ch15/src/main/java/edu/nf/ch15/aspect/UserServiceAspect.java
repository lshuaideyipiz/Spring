package edu.nf.ch15.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author LZ
 * @date 2020/12/8
 * 定义切面
 */
public class UserServiceAspect implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {

    public void afterThrowing(Exception e){
        System.out.println("异常通知"+e.getMessage());
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前...");
        Object returnVal = methodInvocation.proceed();
        System.out.println("环绕后...");
        return returnVal;

    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知");
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }
}
