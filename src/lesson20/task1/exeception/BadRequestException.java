package lesson20.task1.exeception;

/**
 * Created by Alex on 17.11.2017.
 */
public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
