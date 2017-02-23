package com.cvte.taskssm.dao;

import com.cvte.taskssm.model.Task;
import com.cvte.taskssm.model.TaskUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */

@Repository
public interface TaskUserDao {

    List<TaskUser> selectTaskUserByUserId(Long id);

    void updateTaskUser(TaskUser taskUser);
}
