package edu.nf.ch16.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @author LZ
 * @date 2020/12/8
 * jp 连接点实例，可以获取目标方法信息
 */
public class UserServiceAspect {

    public void before(JoinPoint jp){
        System.out.println("前置通知，目标方法"+jp.getArgs());
    }

    /**
     *
     * @param pjp 连接点实例，继承自JoinPoint
     *            可以获取目标方法参数，方法信息等，以及调用目标方法
     * @return
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知前");
        //获取目标方法的Method对象
        MethodSignature ms = (MethodSignature) pjp.getSignature();
        Method method = ms.getMethod();
        System.out.println("当前调用的目标方法："+method.getName());
        //调用目标方法
        Object returnVal = pjp.proceed();
        System.out.println("环绕通知后");
        return returnVal;
    }


    public void afterReturning(JoinPoint jp,String returnVal){
        System.out.println("后置通知，返回值："+returnVal);
    }

    /**
     *
     * @param hp 连接点实例
     * @param e 目标对象产生的异常对象
     */
    public void afterThrowing(JoinPoint hp,Exception e){
        System.out.println("异常通知，异常信息"+e.getMessage());
    }

    /**
     * 最终通知，不管有没有异常产生，都会执行的
     * @param jp
     */
    public void after(JoinPoint jp){
        System.out.println("最终通知");
    }
}
