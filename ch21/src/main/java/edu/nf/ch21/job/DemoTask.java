package edu.nf.ch21.job;

import edu.nf.ch21.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author LZ
 * @date 2020/12/9
 * 定时任务处理类
 */
@Component
public class DemoTask {
    @Autowired
    /**
     * 定时任务需要反复执行taskService业务逻辑
     * 因此将它注入进来
     */
    private TaskService taskService;

    @Scheduled(cron = "0/3 * * * * ?")
    public void executeBackup(){
        taskService.backup();
    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void executeClean(){
        taskService.clean();
    }
}
