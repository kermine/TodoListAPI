package project.TodoListAPI.domain.service.taskService;

import project.TodoListAPI.domain.Task;
import project.TodoListAPI.domain.repository.TaskRepository;
import project.TodoListAPI.infraestructure.persistence.entities.TaskEntity;
import project.TodoListAPI.infraestructure.persistence.mapper.TaskMapper;

import java.util.Optional;

/**
 * The type Todo list service.
 */
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    private final TaskMapper taskMapper;

    /**
     * Instantiates a new Todo list service.
     *
     * @param taskRepository the todo list repository
     */
    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    /**
     * Create task int.
     *
     * @param task the task
     * @return the int
     */
    @Override
    public int createTask(Task task) {
       return taskRepository.save(taskMapper.convertFromDomainTask(task)).getId();
    }


    /**
     * Update task.
     *
     * @param task the task
     */
    @Override
    public void updateTask(Task task, int id) {
        Optional<TaskEntity> taskEntity = taskRepository.findById(id);
    }


    /**
     * Delete task.
     *
     * @param id the id
     */
    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }
}
