package com.prathmeshrai.TodolistSpringBootApp.dataseed;

import com.github.javafaker.Faker;
import com.prathmeshrai.TodolistSpringBootApp.model.StatusEnum;
import com.prathmeshrai.TodolistSpringBootApp.model.Task;
import com.prathmeshrai.TodolistSpringBootApp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskDataLoader implements CommandLineRunner {

    @Autowired
    TaskRepository taskRepository ;

    @Override
    public void run(String... args){
          loadTaskData();
    }

    private void loadTaskData(){
          Faker faker = new Faker() ;
          if( taskRepository.count() == 0 )
          for( int i = 0 ; i < 200 ; i++ ){
              Task t = new Task() ;
              t.setDescription(faker.lorem().sentence());
              t.setStatus(faker.bool().bool() ? StatusEnum.completed : StatusEnum.pending);
              taskRepository.save(t);
          }
    }




}
