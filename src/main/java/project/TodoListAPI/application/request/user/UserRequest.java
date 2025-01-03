package project.TodoListAPI.application.request.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import project.TodoListAPI.domain.User;

public class UserRequest {

    private User user;

    @JsonCreator
    public UserRequest(@JsonProperty("user") User user){
        this.user= user;
    }

    public User getUser() {
        return user;
    }
}
