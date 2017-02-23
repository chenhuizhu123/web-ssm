package com.cvte.taskssm.controller;

import com.cvte.taskssm.model.Task;
import com.cvte.taskssm.service.TaskService;
import com.cvte.taskssm.service.UserService;
import com.cvte.taskssm.model.User;
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
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;
    @Resource
    private TaskService taskService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String username,String password,Model model){
        User user= userService.login(username,password);
        request.getSession().setAttribute("user",user);
        List<Task> tasks=taskService.findTaskSetByUserId(user.getId());
        log.info("查询task--"+tasks.get(0));
        int maxExperience=60;
        for(int i=0;i<tasks.size();i++){
            maxExperience+=tasks.get(i).getTaskExperience();
        }
        int tasknums=tasks.size();
        model.addAttribute("user",user);
        model.addAttribute("maxExperience",maxExperience);
        model.addAttribute("tasknums",tasknums);
        model.addAttribute("taskList",tasks);
        return "/showTask";
    }

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        log.info("查询所有用户信息2"+userList.get(1));
        System.out.println("查询所有用户信息2"+userList.get(1));
        model.addAttribute("userList",userList);
        return "/showUser";
    }
}
