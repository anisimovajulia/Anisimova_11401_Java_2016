package service;

import entities.User;

/**
 * Created by Julia_2 on 07.05.2016.
 */
public interface UserService {
    User getUser(String login);
}
