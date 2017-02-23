package com.cvte.taskssm.service.impl;

import com.cvte.taskssm.dao.TaskDao;
import com.cvte.taskssm.dao.TaskUserDao;
import com.cvte.taskssm.model.Task;
import com.cvte.taskssm.model.TaskUser;
import com.cvte.taskssm.service.TaskUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class TaskUserServiceImpl implements TaskUserService {
    
    @Resource
    private TaskUserDao taskUserDao;

    public void updateTaskState(TaskUser taskUser) {
        taskUserDao.updateTaskUser(taskUser);
    }

    public List<TaskUser> selectTaskUserByUserId(Long id) {
        return taskUserDao.selectTaskUserByUserId(id);
    }

}
