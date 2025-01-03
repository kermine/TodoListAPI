package project.TodoListAPI.domain.service.userService;

import project.TodoListAPI.domain.User;
import project.TodoListAPI.domain.repository.UserRepository;
import project.TodoListAPI.infraestructure.persistence.mapper.UserMapper;

/**
 * The type User service.
 */
public class UserServiceImpl implements UserService  {

    private UserRepository userRepository;

    private UserMapper userMapper;

    /**
     * Instantiates a new User service.
     *
     * @param userRepository the user repository
     */
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    /**
     * Create user int.
     *
     * @param user the user
     * @return the int
     */
    @Override
    public int createUser(User user) {
      return  userRepository.save(userMapper.convertFromUserDomain(user)).getId();
    }
}
