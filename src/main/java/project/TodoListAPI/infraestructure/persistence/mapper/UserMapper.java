package project.TodoListAPI.infraestructure.persistence.mapper;

import org.springframework.stereotype.Component;
import project.TodoListAPI.domain.User;
import project.TodoListAPI.infraestructure.persistence.entities.UserEntity;

@Component
public class UserMapper {


    public UserEntity convertFromUserDomain(User user){
        return new UserEntity(user.getName(),user.getEmail(), user.getPassword());
    }
}
