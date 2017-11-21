package lesson20.task1.exeception;

/**
 * Created by Alex on 17.11.2017.
 */
public class InternalServerException extends Exception {
    public InternalServerException(String message) {
        super(message);
    }
}
