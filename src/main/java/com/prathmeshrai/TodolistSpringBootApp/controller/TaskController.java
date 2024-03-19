package com.prathmeshrai.TodolistSpringBootApp.controller;

import com.prathmeshrai.TodolistSpringBootApp.model.Task;
import com.prathmeshrai.TodolistSpringBootApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/createTasks")
    public Task createTask(Task t){
        return taskService.createTask(t);
    }

}
