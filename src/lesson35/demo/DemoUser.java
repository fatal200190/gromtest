package lesson35.demo;

import lesson35.model.User;
import lesson35.model.UserType;
import lesson35.repository.UserRepository;

public class DemoUser {
    public static void main(String[] args) throws Exception {
        User user = new User(1233,"Tom","12345", "UK", UserType.USER);
        UserRepository userRepository = new UserRepository();
//        userRepository.registerUser(user);
        System.out.println(userRepository.read());
    }
}
