package edu.nf.ch21.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * @author LZ
 * @date 2020/12/9
 */
@Configuration
@ComponentScan(basePackages = "edu.nf.ch21")
@EnableScheduling
/**
 * 实现SchedulingConfigurer配置线程池
 */
public class AddConfig implements SchedulingConfigurer {
    /**
     * 装配一个定时任务线程池
     * @return
     */
    @Bean(destroyMethod = "shutdown")
    public ThreadPoolTaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        /**
         * 设置线程池大小
         */
        scheduler.setPoolSize(2);
        /**
         * 设置线程名称签的前缀
         */
        scheduler.setThreadNamePrefix("任务线程-");
        return scheduler;
    }

    /**
     * 配置定时任务，线程池
     * @param scheduledTaskRegistrar
     */
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        /**
         * 注册定时任务线程池
         */
        scheduledTaskRegistrar.setScheduler(taskScheduler());
    }
}
