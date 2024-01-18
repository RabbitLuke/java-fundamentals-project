package org.example.service;

import org.example.emums.Status;
import org.example.model.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    Task addTask(Task task);

    List<Task> getTasks(Long employeeId, Status status);

    List<Task> getTasks(Long employeeId);

    List<Task> getTasks();
}
