package edu.nf.ch17.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author LZ
 * @date 2020/12/8
 *@Aspect 标识当前类为切面类
 * @Component 表示为受IOC容器管理
 */
@Aspect
@Component
public class StuServiceAspect {
    /**
     * JoinPoint必须是参数的第一个
     */
    /**
     * 自定义切入点，此方法只用于给@Pointcut注解标识，声明切入点表达式
     */
    @Pointcut("execution(* edu.nf.ch17.service.impl.*.*(..))")
    public void pointcut(){};

    @Around("execution(* edu.nf.ch17.service.impl.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前置通知");
        //调用目标方法
        Object returnVal = pjp.proceed();
        System.out.println("环绕后置通知");
        return returnVal;
    }

    @Before("pointcut()")
    public void before(JoinPoint jp){
        System.out.println("前置通知，参数"+jp.getArgs()[0]);
    }

    @AfterReturning(value = "pointcut()",returning = "returnVal")
    public void afterReturning(JoinPoint jp,String returnVal){
        System.out.println("后置通知，返回值"+returnVal);
    }
    @AfterThrowing(value = "pointcut()",throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e){
        System.out.println("异常"+e.getMessage());
    }
    @After("pointcut()")
    public void after(JoinPoint jp){
        System.out.println("最终通知");
    }
}
