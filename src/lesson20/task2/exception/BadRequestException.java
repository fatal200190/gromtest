package lesson20.task2.exception;

/**
 * Created by Alex on 17.11.2017.
 */
public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }

}
