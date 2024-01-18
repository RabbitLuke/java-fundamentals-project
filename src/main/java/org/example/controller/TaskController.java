package org.example.controller;

import org.example.model.dto.EmployeeDto;
import org.example.model.dto.TaskDto;
import org.example.model.entity.Employee;
import org.example.model.entity.Task;
import org.example.service.EmployeeService;
import org.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("")
    public ResponseEntity<?> addTask(@RequestBody TaskDto taskDto) {
        Task savedTask = taskService.addTask(taskDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }
}
