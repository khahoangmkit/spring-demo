package com.example.todoapp.dao;

import com.example.todoapp.entity.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO {

    private EntityManager entityManager;

    public TaskDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Task task) {
        this.entityManager.persist(task);
    }

    @Override
    public Task findById(int id) {
        return entityManager.find(Task.class, id);
    }
    @Override
    @Transactional
    public void updateTask(int id, String status) {
        Task task = findById(id);
        task.setStatus(status);
        entityManager.merge(task);
    }

    @Override
    @Transactional
    public void removeTask(int id) {
        // remove with object
//        Task task = findById(id);
//        entityManager.remove(task);

        //remove with query
        entityManager.createQuery("delete from Task where id in :id")
                .setParameter("id", List.of(1,2))
                .executeUpdate();

        System.out.println("Remove Task: " + id);
    }

    @Override
    public List<Task> findTaskByStatus(String status) {
        TypedQuery<Task> theQuery = entityManager.createQuery("From Task where status=:theStatus", Task.class);

        theQuery.setParameter("theStatus", status);

        return theQuery.getResultList();
    }

}
