package edu.nf.ch18.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author LZ
 * @date 2020/12/9
 * @Configuration标识为配置类
 */
@Configuration
/**
 * 扫描包
 */
@ComponentScan(basePackages = "edu.nf.ch18")
/**
 * 启用AOP注解处理器
 * 参数proxyTargetClass=true 标识是否强制使用cglib动态代理
 */
@EnableAspectJAutoProxy()
public class SpringConfig {
}
