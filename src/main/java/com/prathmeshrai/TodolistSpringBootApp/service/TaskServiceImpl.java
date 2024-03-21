package com.prathmeshrai.TodolistSpringBootApp.service;

import com.prathmeshrai.TodolistSpringBootApp.model.Task;
import com.prathmeshrai.TodolistSpringBootApp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task t) {
        return taskRepository.save(t);
    }

    @Override
    public List<Task> getTasks(){
        return taskRepository.findAll();
    }

}
