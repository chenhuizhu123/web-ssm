package com.cvte.taskssm.model;

/**
 * Created by cvter on 2017/2/20.
 */
public  class Task {
    private Long id;
    private String taskName;
    private String taskInfo;
    private int taskExperience;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo;
    }

    public int getTaskExperience() {
        return taskExperience;
    }

    public void setTaskExperience(int taskExperience) {
        this.taskExperience = taskExperience;
    }




}
