package com.cvte.taskssm.model;

/**
 * Created by cvter on 2017/2/22.
 */
public class TaskUser {
    private long id;
    private long userId;
    private long taskId;
    private int taskprocess;
    private String taskstate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public int getTaskprocess() {
        return taskprocess;
    }

    public void setTaskprocess(int taskprocess) {
        this.taskprocess = taskprocess;
    }

    public String getTaskstate() {
        return taskstate;
    }

    public void setTaskstate(String taskstate) {
        this.taskstate = taskstate;
    }


}

