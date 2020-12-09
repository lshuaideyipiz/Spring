package edu.nf.ch21.job;

import edu.nf.ch21.service.TaskService;

/**
 * @author LZ
 * @date 2020/12/9
 * 定时任务处理类
 */
public class DemoTask {
    private TaskService taskService;
    /**
     * 定时任务需要反复执行taskService业务逻辑
     * 因此将它注入进来
     */
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }
    public void executeBackup(){
        taskService.backup();
    }
    public void executeClean(){
        taskService.clean();
    }
}
