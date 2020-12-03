package edu.nf.ch09.controller;

import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author LZ
 * @date 2020/12/3
 */
//使用Component注解标识类，表示为受容器所管理的类
//如果没有指定value属性，name就将类名首字母小写作为他的ID，指定了value属性，那么ID就是value值;
/*@Component("controller")*/
//从3.0后开始，每个层都有对相应的注解来标识，作用和Component作用一样，这样标识起来更加直观知道是什么层
@Controller("controller")
//@Scope注解用于指定Bean的作用域，作用和xml中的一致
@Scope("")
public class UserController {
    private UserService userService;

    //主借用于完成注入配置，可以加在set和构造方法还有字段上
    //注意当实现类只有一个的时候，Spring会自动找到他并直接注入进来,
    // 如果有多个实现类的时候，就必须配合@Qualifier注解一起使用
    //@Qualifier作用就是指定注入哪一个实现类
    @Autowired
    @Qualifier("userServiceImpl")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        userService.add();
    }
    //@PostConstruct注解标识自定义初始化方法
    @PostConstruct
    public void init(){
        System.out.println("执行自定义的init方法");
    }

    //@PreDestroy用于标识自定义摧毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("执行自定义的destroy方法");
    }
}
