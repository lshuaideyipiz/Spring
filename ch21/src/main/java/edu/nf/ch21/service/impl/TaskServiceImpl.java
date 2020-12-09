package edu.nf.ch21.service.impl;

import edu.nf.ch21.service.TaskService;
import org.springframework.stereotype.Service;

/**
 * @author LZ
 * @date 2020/12/9
 */
@Service
public class TaskServiceImpl implements TaskService {
    public void backup() {
        System.out.println(Thread.currentThread().getName()+"执行备份");
    }

    public void clean() {
        System.out.println(Thread.currentThread().getName()+"执行清理");
    }
}
