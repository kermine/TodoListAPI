package project.TodoListAPI.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.TodoListAPI.infraestructure.persistence.entities.TaskEntity;


/**
 * The interface Todo list repository.
 */
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
}
