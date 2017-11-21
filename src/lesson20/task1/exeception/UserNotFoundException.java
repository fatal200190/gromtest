package lesson20.task1.exeception;

/**
 * Created by Alex on 17.11.2017.
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
