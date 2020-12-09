package edu.nf.ch19.demo1;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author LZ
 * @date 2020/12/9
 * 自定义事件监听器
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {
    /**
     *当想容器发布一个事件的时候，会被此监听器监听到
     * 容器就会调用onApplicationEvent方法并传入事件对象
     * 容器会自动调用这个方法
     */
    public void onApplicationEvent(MyEvent myEvent) {
        /**
         * 可以从事件对象中获取事件源
         */
        Object source = myEvent.getSource();
        //将事件源转换为自定义的事件源的对象
        MySource mySource = (MySource)source;
        System.out.println("处理消息："+mySource.getMessage());
    }
}
