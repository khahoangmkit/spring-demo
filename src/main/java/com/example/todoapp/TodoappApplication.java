package com.example.todoapp;

import com.example.todoapp.dao.TaskDAO;
import com.example.todoapp.entity.Task;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TaskDAO taskDAO) {
		return runner -> {
//			createTask(taskDAO);
//			findTaskByStatus(taskDAO);
//			updateTask(taskDAO);
			removeTask(taskDAO);
		};
	}

	private void findTaskByStatus(TaskDAO taskDAO) {
		List<Task> list = taskDAO.findTaskByStatus("inProgress");
		System.out.println("Number of Task In Progress: " + list.size());
	}

	private void createTask(TaskDAO taskDAO) {
		Task task = new Task("Nau Com", "Nau Com toi", "inProgress", System.currentTimeMillis());

		System.out.println("Saving the task...");
		taskDAO.save(task);

		System.out.println("Saved task. Generated id: " + task.getId());
	}

	private void readTask(TaskDAO taskDAO) {
		Task task = taskDAO.findById(3);

		if (task != null) {
			System.out.println("Task: " + task.toString());
		} else {
			System.out.println("Task not found!");
		}
	}

	private void updateTask(TaskDAO taskDAO) {
		taskDAO.updateTask(3, "inProgress");
	}
	private void removeTask(TaskDAO taskDAO) {
		taskDAO.removeTask(3);
	}

}
