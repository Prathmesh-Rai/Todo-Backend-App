package com.prathmeshrai.TodolistSpringBootApp.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task_tbl")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_seq_generator")
    @SequenceGenerator(name="task_seq_generator", sequenceName = "task_tbl_id_seq", allocationSize=1)
    private Long id;

    @Column(name = "description")
    private String description ;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusEnum status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
