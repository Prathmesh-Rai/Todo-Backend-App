package com.prathmeshrai.TodolistSpringBootApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "task_tbl")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {

  @Id
  @GeneratedValue
  private Long id;
    public Long getId() {
        return id;
    }

   public void setId(Long id) {
       this.id = id;
    }


}
