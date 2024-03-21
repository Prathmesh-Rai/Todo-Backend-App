package com.prathmeshrai.TodolistSpringBootApp.service;

import com.prathmeshrai.TodolistSpringBootApp.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task t);

    List<Task> getTasks() ;

    Task updateTask(Task t) ;

    Task changeStatus(Long id);

    void deleteTask(Long id);

}
