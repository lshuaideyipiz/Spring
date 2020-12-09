package edu.nf.ch19.demo1;

import org.springframework.context.ApplicationEvent;

/**
 * @author LZ
 * @date 2020/12/9
 * 自定义事件对象
 */
public class MyEvent extends ApplicationEvent {
    /**
     * 事件源
     * @param source
     */
    public MyEvent(Object source){
        super(source);
    }
}
