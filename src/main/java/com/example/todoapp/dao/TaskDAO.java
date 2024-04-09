package com.example.todoapp.dao;

import com.example.todoapp.entity.Task;

import java.util.List;

public interface TaskDAO {
    void save(Task task);
    Task findById(int task);

    List<Task> findTaskByStatus(String status);
    void updateTask(int id, String status);

    void removeTask(int id);
}
