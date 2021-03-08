package com.bishe.smartcommunity.resident.utils;

import com.bishe.smartcommunity.resident.domain.Resident;
import com.bishe.smartcommunity.resident.domain.Task;

public class TaskVo {
    private Resident resident;
    private Task task;

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskVo(Resident resident, Task task) {
        super();
        this.resident = resident;
        this.task = task;
    }
}
