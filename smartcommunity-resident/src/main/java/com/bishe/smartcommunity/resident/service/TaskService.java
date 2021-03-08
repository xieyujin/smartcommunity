package com.bishe.smartcommunity.resident.service;

import com.bishe.smartcommunity.resident.domain.Resident;
import com.bishe.smartcommunity.resident.domain.Task;

import java.util.List;

public interface TaskService {

    Task newtask(Resident resident, Task task);

    List<Task> listAll();
}
