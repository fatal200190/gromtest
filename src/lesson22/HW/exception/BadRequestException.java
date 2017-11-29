package lesson22.HW.exception;

/**
 * Created by Alex on 17.11.2017.
 */
public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }

}
