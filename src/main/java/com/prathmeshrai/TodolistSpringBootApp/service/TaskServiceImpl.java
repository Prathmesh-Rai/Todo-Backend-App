package com.prathmeshrai.TodolistSpringBootApp.service;

import com.prathmeshrai.TodolistSpringBootApp.model.StatusEnum;
import com.prathmeshrai.TodolistSpringBootApp.model.Task;
import com.prathmeshrai.TodolistSpringBootApp.repository.TaskRepository;
import org.hibernate.dialect.function.AggregateWindowEmulationQueryTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task t) {
        return taskRepository.save(t);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task updateTask(Task t){
        return taskRepository.save(t);
    }

    @Override
    public Task changeStatus(Long id) {
       Optional<Task> t = taskRepository.findById(id) ;
       if(t.isPresent()){
           Task currTask = t.get() ;
           currTask.setStatus(StatusEnum.completed);
           return taskRepository.save(currTask) ;
       }
       else{
           return null ;
       }
    }

    @Override
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }


}
