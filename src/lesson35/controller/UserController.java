package lesson35.controller;

import lesson35.service.UserService;
import lesson35.model.User;

public class UserController {

    UserService userService = new UserService();

    public User registerUser(User user) throws Exception {
        userService.registerUser(user);
        return user;
    }
    public void login(String userName, String password)  throws Exception {
        userService.login(userName,password);
    }
    public void logout() throws Exception {
        userService.logout();
    }

}
