package project.TodoListAPI.domain.service.taskService;

import project.TodoListAPI.domain.Task;

/**
 * The interface Todo list service.
 */
public interface TaskService {

    /**
     * Create task int.
     *
     * @param task the task
     * @return the int
     */
    int createTask(Task task);

    /**
     * Update task.
     *
     * @param task the task
     */
    void updateTask(Task task, int id);

    /**
     * Delete task.
     *
     * @param id the id
     */
    void deleteTask (int id);



}
