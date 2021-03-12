package com.bishe.smartcommunity.resident.controller;

import com.bishe.smartcommunity.resident.domain.Task;
import com.bishe.smartcommunity.resident.service.TaskService;
import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/allTask")
    public R all(){
        try {
            List<Task> allTask = taskService.listAll();
            return R.success(allTask);
        }catch (Exception e) {
            return R.error(e.getMessage());
        }
    }
}
