package com.prathmeshrai.TodolistSpringBootApp.controller;

import com.prathmeshrai.TodolistSpringBootApp.model.StatusEnum;
import com.prathmeshrai.TodolistSpringBootApp.model.Task;
import com.prathmeshrai.TodolistSpringBootApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/updateTask/{id}")
    public Task updateTask(@PathVariable Long id,@RequestBody Task t){
        t.setId(id);
        return taskService.updateTask(t);
    }

    @PutMapping("/markAsCompleted/{id}")
    public Task changeStatus(@PathVariable Long id){
        return taskService.changeStatus(id);
    }

    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id) ;
    }

}
