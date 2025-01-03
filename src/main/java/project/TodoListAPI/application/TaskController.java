package project.TodoListAPI.application;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.TodoListAPI.application.request.task.TaskRequest;
import project.TodoListAPI.domain.service.taskService.TaskService;

/**
 * The type Todo list controller.
 */
@RestController
@RequestMapping(value = "/TodoList/task")
public class TaskController {

    private final TaskService taskService;


    /**
     * Instantiates a new Todo list controller.
     *
     * @param taskService the todo list service
     */
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    /**
     * CreateUser.
     *
     * @param userRequest the user request
     */
    @PostMapping(value = "todos", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createTask(@RequestBody TaskRequest userRequest){
        this.taskService.createTask(userRequest.getTask());
    }


}
