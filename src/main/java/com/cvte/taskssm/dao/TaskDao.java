package com.cvte.taskssm.dao;

import com.cvte.taskssm.model.Task;
import com.cvte.taskssm.model.TaskUser;
import com.cvte.taskssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */

@Repository
public interface TaskDao {

    Task selectTaskById(@Param("taskId") Long taskId);

    List<Task> selectAllTask();

    List<Task> findTaskSetByUserId(@Param("userId") Long userId);

    void updateTaskState(@Param("taskUser") TaskUser taskUser);
}
