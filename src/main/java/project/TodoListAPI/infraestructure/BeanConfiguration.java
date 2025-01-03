package project.TodoListAPI.infraestructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.TodoListAPI.domain.repository.TaskRepository;
import project.TodoListAPI.domain.repository.UserRepository;
import project.TodoListAPI.domain.service.taskService.TaskService;
import project.TodoListAPI.domain.service.taskService.TaskServiceImpl;
import project.TodoListAPI.domain.service.userService.UserService;
import project.TodoListAPI.domain.service.userService.UserServiceImpl;
import project.TodoListAPI.infraestructure.persistence.mapper.TaskMapper;
import project.TodoListAPI.infraestructure.persistence.mapper.UserMapper;

/**
 * Configuration for instanciate the beans in the Spring Context
 */
@Configuration
public class BeanConfiguration {


    /**
     * Todo list service todo list service.
     *
     * @param taskRepository the todo list repository
     * @param taskMapper     the task mapper
     * @return the todo list service
     */
    @Bean
    public TaskService taskService(TaskRepository taskRepository, TaskMapper taskMapper){
        return new TaskServiceImpl(taskRepository, taskMapper);
    }

    /**
     * User service user service.
     *
     * @param userRepository the user repository
     * @param userMapper     the user mapper
     * @return the user service
     */
    @Bean
    public UserService userService(UserRepository userRepository, UserMapper userMapper){
        return new UserServiceImpl(userRepository,userMapper);
    }
}
