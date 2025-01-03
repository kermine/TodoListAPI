package project.TodoListAPI.application.request.task;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import project.TodoListAPI.domain.Task;

/**
 * The type User request.
 */
public class TaskRequest {


    private Task task;

    /**
     * Instantiates a new User request.
     *
     * @param task the task
     */
    @JsonCreator
    public TaskRequest(@JsonProperty("User") final Task task){
        this.task = task;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public Task getTask() {
        return task;
    }
}
