package edu.nf.ch21.service.impl;

import edu.nf.ch21.service.TaskService;

/**
 * @author LZ
 * @date 2020/12/9
 */
public class TaskServiceImpl implements TaskService {
    public void backup() {
        System.out.println(Thread.currentThread().getName()+"执行备份");
    }

    public void clean() {
        System.out.println(Thread.currentThread().getName()+"执行清理");
    }
}
