package edu.nf.ch19.demo2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author LZ
 * @date 2020/12/9
 */
@Component
public class DemoEventListener {
    /**
     * 监听处理方法
     * @param demoEvent
     * EventListener标注当前方法是一个事件监听处理器方法
     */
    @EventListener
    public void handleEven(DemoEvent demoEvent){
        System.out.println("处理消息:"+demoEvent.getMessage());
    }
}
