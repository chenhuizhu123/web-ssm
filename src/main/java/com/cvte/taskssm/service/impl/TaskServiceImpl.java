package com.cvte.taskssm.service.impl;

import com.cvte.taskssm.dao.TaskDao;
import com.cvte.taskssm.dao.UserDao;
import com.cvte.taskssm.model.Task;
import com.cvte.taskssm.model.TaskUser;
import com.cvte.taskssm.model.User;
import com.cvte.taskssm.service.TaskService;
import com.cvte.taskssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class TaskServiceImpl implements TaskService {
    
    @Resource
    private TaskDao taskDao;

    public Task getTaskById(Long taskId) {
            return taskDao.selectTaskById(taskId);
    }

    public List<Task> getAllTask() {
        return taskDao.selectAllTask();
    }
    //
    public void updateTaskState(TaskUser taskUser) {
        taskDao.updateTaskState(taskUser);
    }

    public List<Task> findTaskSetByUserId(Long id) {
        return taskDao.findTaskSetByUserId(id);
    }
}
