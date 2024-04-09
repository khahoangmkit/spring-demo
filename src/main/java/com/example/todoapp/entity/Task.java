package com.example.todoapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "describe")
    private String describe;
    @Column(name = "status")
    private String status;
    @Column(name = "deadline")
    private long deadline;

    public Task(int id, String name, String describe, String status, long deadline) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.status = status;
        this.deadline = deadline;
    }

    public Task(String name, String describe, String status, long deadline) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.status = status;
        this.deadline = deadline;
    }

    public Task() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public String getStatus() {
        return status;
    }

    public long getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", status='" + status + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
