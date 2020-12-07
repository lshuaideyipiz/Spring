package edu.nf.ch.test;

import edu.nf.ch13.UserService;
import edu.nf.ch13.UserServiceImpl;
import edu.nf.ch13.jdk.LogInvocationHandler;
import sun.applet.Main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author LZ
 * @date 2020/12/7
 */
public class Test {

    public static void main(String[] args) {
        //创建回调处理器，并闯入目标对象
        InvocationHandler handler = new LogInvocationHandler(new UserServiceImpl());
        //获取一个类加载器，用于加载创建出来的代理字节码，加载成功后创建出一个代理实例
        ClassLoader loader = Test.class.getClassLoader();
        //获取目标对象所实现的接口的class
        Class<?>[] infClasses = UserServiceImpl.class.getInterfaces();
        //使用Proxy创建代理对象，并且创建出来的代理对象会自动实现上面的接口
        UserService service = (UserService) Proxy.newProxyInstance(loader,infClasses,handler);
        //调用代理对象
        service.add();
        service.getUser();
        service.update();
    }
}
