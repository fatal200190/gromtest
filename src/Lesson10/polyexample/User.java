package Lesson10.polyexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class User extends Human {
    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("User class is called...");
        super.run();
    }
}
