package com.prathmeshrai.TodolistSpringBootApp.controller;

import com.prathmeshrai.TodolistSpringBootApp.model.StatusEnum;
import com.prathmeshrai.TodolistSpringBootApp.model.Task;
import com.prathmeshrai.TodolistSpringBootApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;
    @PostMapping("/createTasks")
    public Task createTask(@RequestBody Task t){
        return taskService.createTask(t);
    }

    @GetMapping("/getTasks")
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

}
