package com.prathmeshrai.TodolistSpringBootApp.repository;

import com.prathmeshrai.TodolistSpringBootApp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

}
