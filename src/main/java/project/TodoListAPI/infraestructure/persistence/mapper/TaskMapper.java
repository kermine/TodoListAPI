package project.TodoListAPI.infraestructure.persistence.mapper;


import org.springframework.stereotype.Component;
import project.TodoListAPI.domain.Task;
import project.TodoListAPI.infraestructure.persistence.entities.TaskEntity;

@Component
public class TaskMapper {


    public TaskEntity convertFromDomainTask(Task task){
        return new TaskEntity(task.getTitle(), task.getDescription());
    }
}
