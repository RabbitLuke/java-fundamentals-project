package org.example.service;

import org.example.emums.Status;
import org.example.model.dto.TaskDto;
import org.example.model.entity.Employee;
import org.example.model.entity.Task;
import org.example.repository.EmployeeRepository;
import org.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, EmployeeRepository employeeRepository) {
        this.taskRepository = taskRepository;
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public Task addTask(TaskDto task, long id) {
        Task task1 = new Task();
        Employee employee = new Employee();
        if(employeeRepository.findById(id).isPresent()){
            task1.setStatus(Status.valueOf(task.getStatus()));
            task1.setDescription(task.getDescription());
            employee.setId(id);
        }
        return taskRepository.save(task1);
    }

    @Override
    public List<Task> getTasks(Long employeeId, Status status) {
        return null;
    }

    @Override
    public List<Task> getTasks(Long employeeId) {
        return null;
    }

    @Override
    public List<Task> getTasks() {
        return null;
    }
}
