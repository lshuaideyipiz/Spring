package edu.nf.ch04.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author LZ
 * @date 2020/12/1
 * BeanPostProcessor这个接口称为bean的后处理器
 * 他可以在spring容器实例化bean并完成依赖注入，在初始化方法的前后执行
 * 用于处理其他的罗技，注意这个接口是针对所有的Bean
 */
public class MyPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessBeforeInitialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessAfterInitialization");
        return bean;
    }
}
