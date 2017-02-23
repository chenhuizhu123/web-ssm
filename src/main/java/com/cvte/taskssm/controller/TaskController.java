package com.cvte.taskssm.controller;

import com.cvte.taskssm.model.Task;
import com.cvte.taskssm.model.TaskUser;
import com.cvte.taskssm.model.User;
import com.cvte.taskssm.service.TaskService;
import com.cvte.taskssm.service.TaskUserService;
import com.cvte.taskssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */
@Controller
@RequestMapping("/task")
public class TaskController {
    private Logger log = Logger.getLogger(TaskController.class);
    @Resource
    private TaskService taskService;
    @Resource
    private UserService userService;
    @Resource
    private TaskUserService taskUserService;
    //领取任务
    @RequestMapping("/getTask")
    public String showUser(HttpServletRequest request, long taskid,Model model){
        User user=(User)request.getSession().getAttribute("user");
        //update task
        TaskUser taskUser=new TaskUser();
        taskUser.setId(taskid);
        taskUser.setTaskstate("已完成");
        taskUser.setUserId(user.getId());
        taskService.updateTaskState(taskUser);
        //update user
        int experience=user.getExperience()+10;
        Long userId=user.getId();                    //
        user.setExperience(experience);
        userService.updateExperience(user);
        //select taskuser
        List<TaskUser> taskUsers=taskUserService.selectTaskUserByUserId(user.getId());
        model.addAttribute("taskUserList",taskUsers);
        //update taskuser
        //TaskUser taskUser=new TaskUser();
        //taskUserService.updateTaskState();
        model.addAttribute("taskUserList",taskUsers);

        List<Task> tasks=taskService.findTaskSetByUserId(user.getId());  //
        int maxExperience=60;
        for(int i=0;i<tasks.size();i++){
            maxExperience+=tasks.get(i).getTaskExperience();
        }
        int tasknums=tasks.size();
        model.addAttribute("user",user);
        model.addAttribute("maxExperience",maxExperience);
        model.addAttribute("tasknums",tasknums);
        model.addAttribute("taskList",tasks);
        return "showTask";
    }
}
