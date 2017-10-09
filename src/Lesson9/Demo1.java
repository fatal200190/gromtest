package Lesson9;

import java.util.Arrays;

/**
 * Created by Alex on 14.08.2017.
 */
public class Demo1 {
    public static void main(String[] args) {
//        User user = new User(125, "Ivan", "RRR");
//        User[] users = new User[10];
//        String[] nemo = new String[5];
//        nemo[0] = "Pavel";
//        nemo[1] = "Kavel";
//        nemo[2] = "Ravel";
//        nemo[3] = "Vavel";
//        nemo[4] = "Babel";

        UserRepository userRepository = new UserRepository();
        //***save кейс
        //сохранение юзера +
        //сохранение того же юзера +
        //когда сохраняем null +

        User user = new User(101, "Ivan", "1f1f");
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.save(null);

        //***update кейс
        //обновление юзера +
        //когда нет юзера на обновление +
        //когда обновляем null +

        User user1 = new User(101, "Peter", "1b1b");
        userRepository.update(user1);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.update(null);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //***delete кейс
        //когда нет юзера на удаление +
        //удаление юзера +

        userRepository.delete(102);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.delete(101);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));






    }

}