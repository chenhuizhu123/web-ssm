package com.cvte.taskssm.service;

import com.cvte.taskssm.model.Task;
import com.cvte.taskssm.model.TaskUser;

import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */
public interface TaskUserService {

    void updateTaskState(TaskUser taskUser);

    List<TaskUser> selectTaskUserByUserId(Long id);
}
