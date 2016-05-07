package serviceImpl;

import entities.User;
import service.UserService;

/**
 * Created by Julia_2 on 07.05.2016.
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String login) {
        User user = new User();
        user.setEmail(login);
        user.setHash("123456");
        return user;
    }
}
