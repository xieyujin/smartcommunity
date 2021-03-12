package com.bishe.smartcommunity.resident.service.impl;

import com.bishe.smartcommunity.resident.domain.Resident;
import com.bishe.smartcommunity.resident.domain.Task;
import com.bishe.smartcommunity.resident.mapper.TaskMapper;
import com.bishe.smartcommunity.resident.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public Task newtask(Resident resident, Task t) {
        Task task = new Task();
        task.setTaskName(t.getTaskName());
        task.setTaskDescription(t.getTaskDescription());
        task.setTaskState(1);
        task.setTaskInitiatorid(resident.getResidentId());
        task.setTaskCreated(new Date());
        task.setTaskIntroduction(t.getTaskIntroduction());
        return task;
    }

    @Override
    public List<Task> listAll() {
        List<Task> allTask = taskMapper.findAllTask();
        return allTask;
    }
}
