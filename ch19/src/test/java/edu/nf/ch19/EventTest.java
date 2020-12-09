package edu.nf.ch19;

import edu.nf.ch19.demo1.MyEvent;
import edu.nf.ch19.demo1.MySource;
import edu.nf.ch19.demo2.DemoEvent;
import edu.nf.ch19.demo2.DemoEventListener;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LZ
 * @date 2020/12/9
 */
public class EventTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext("edu.nf.ch19.demo1");
        /**
         * 创建事件源
         */
        MySource source = new MySource("hello");
        /**
         * 创建事件对象
         */
        MyEvent event = new MyEvent(source);
        context.publishEvent(event);
    }
    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext("edu.nf.ch19.demo2");
        DemoEvent demoEvent = new DemoEvent("hello2");
        context.publishEvent(demoEvent);
    }
}
