package lesson35.demo;

import lesson35.controller.UserController;
import lesson35.model.User;
import lesson35.model.UserType;
import lesson35.service.UserService;

import java.io.File;

public class DemoUser {
    public static void main(String[] args) throws Exception {
        User user = new User("Tim","12345", "UK", UserType.USER);
        UserController userController = new UserController();
        UserService userService = new UserService();
//        userController.registerUser(user);
        userController.login("Tim","12345");
//        userController.logout();
    }
}
