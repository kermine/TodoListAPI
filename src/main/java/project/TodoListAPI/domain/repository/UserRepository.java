package project.TodoListAPI.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.TodoListAPI.infraestructure.persistence.entities.UserEntity;

/**
 * The interface User repository.
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
