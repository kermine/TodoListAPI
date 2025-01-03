package project.TodoListAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import project.TodoListAPI.domain.repository.TaskRepository;
import project.TodoListAPI.infraestructure.persistence.entities.TaskEntity;

@SpringBootApplication
public class TodoListApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApiApplication.class, args);
	}
}
