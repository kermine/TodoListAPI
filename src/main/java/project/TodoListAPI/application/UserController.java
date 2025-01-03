package project.TodoListAPI.application;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.TodoListAPI.application.request.user.UserRequest;
import project.TodoListAPI.domain.User;
import project.TodoListAPI.domain.service.userService.UserService;

/**
 * The type User controller.
 */
@RestController
@RequestMapping(value = "TodoList/user")
public class UserController {

    private UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Create user.
     *
     * @param userRequest the user request
     */
    @PostMapping(value ="register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserRequest userRequest){
        userService.createUser(userRequest.getUser());
    }
}
